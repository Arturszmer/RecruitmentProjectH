package main.service;

import main.modules.Block;
import main.modules.CompositeBlock;

import java.util.List;
import java.util.Optional;

public class Wall implements Structure{
    private final List<Block> blocks;

    public Wall(CompositeBlock compositeBlock) {
        this.blocks = compositeBlock.getBlocks();
    }

    @Override
    public Optional findBlockByColor(String color) {
        return blocks.stream()
                .filter(f -> f.getColor().equals(color))
                .findFirst();
    }

    @Override
    public List findBlocksByMaterial(String material) {
        return blocks.stream()
                .filter(f -> f.getMaterial().equals(material))
                .toList();
    }

    @Override
    public int count() {
        return blocks.size();
    }

}
