package main.tests;

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
    void countCompositeWall() {
        Wall wall = dataBlocks();
        assertEquals(wall.count(), 5);
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