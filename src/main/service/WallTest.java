package main.service;

import main.modules.BlockEntity;
import main.modules.CompositeBlockImp;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WallTest {


    @org.junit.jupiter.api.Test
    void findBlockByColor() {
        Wall wall = dataPrepared();
        assertEquals(wall.findBlockByColor("red").get(), new BlockEntity("red", "paper"));
    }

    @org.junit.jupiter.api.Test
    void findBlocksByMaterial() {
        Wall wall = dataPrepared();
        int size = 2;
        assertEquals(wall.findBlocksByMaterial("brick").size(), size);
    }

    @org.junit.jupiter.api.Test
    void count() {
        Wall wall = dataPrepared();
        int numberOfBlocks = 5;
        assertEquals(wall.count(), numberOfBlocks);
    }


    private Wall dataPrepared() {
        CompositeBlockImp compositeBlockImp = new CompositeBlockImp();
        compositeBlockImp.add(new BlockEntity("red", "paper"));
        compositeBlockImp.add(new BlockEntity("red", "brick"));
        compositeBlockImp.add(new BlockEntity("white", "brick"));
        compositeBlockImp.add(new BlockEntity("gray", "block"));
        compositeBlockImp.add(new BlockEntity("white", "block"));
        return new Wall(compositeBlockImp);
    }
}