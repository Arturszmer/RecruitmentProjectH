package main.tests;

import main.modules.Block;
import main.modules.BlockEntity;
import main.modules.CompositeBlockImp;
import main.service.Wall;

import static org.junit.jupiter.api.Assertions.*;

class WallTest {


    @org.junit.jupiter.api.Test
    void findCompositeBlockByColor() {
        Wall wall = dataBlocks();
        assertEquals(wall.findBlockByColor("red").orElseThrow(), new BlockEntity("red", "brick"));
    }

    @org.junit.jupiter.api.Test
    void findCompositeBlocksByMaterial() {
        Wall wall = dataBlocks();
        assertEquals(wall.findBlocksByMaterial("brick").size(), 3);
    }

    @org.junit.jupiter.api.Test
    void countBlocks() {
        Wall wall = dataBlocks();
        assertEquals(wall.count(), 5);
    }

    @org.junit.jupiter.api.Test
    void removeBlock() {
        CompositeBlockImp compositeBlockImp = new CompositeBlockImp();
        compositeBlockImp.add(new BlockEntity("red", "brick"));
        compositeBlockImp.add(new BlockEntity("white", "brick"));
        Wall wall = new Wall(compositeBlockImp);
        Block redBlock = (Block) wall.findBlockByColor("red").orElseThrow();
        compositeBlockImp.remove(redBlock);
        assertEquals(wall.count(), 1);
    }


    private Wall dataBlocks() {
        CompositeBlockImp compositeBlockImp = new CompositeBlockImp();
        compositeBlockImp.add(new BlockEntity("red", "brick"));
        compositeBlockImp.add(new BlockEntity("white", "brick"));
        compositeBlockImp.add(new BlockEntity("gray", "brick"));
        compositeBlockImp.add(new BlockEntity("red", "block"));
        compositeBlockImp.add(new BlockEntity("black", "block"));
        return new Wall(compositeBlockImp);
    }
}