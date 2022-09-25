package main.modules;

import java.util.ArrayList;
import java.util.List;

public class CompositeBlockImp implements CompositeBlock {
    private final List<Block> blocks = new ArrayList<>();

    public void add(Block block) {
        blocks.add(block);
    }

    public void remove(Block block){
        blocks.remove(block);
    }

    @Override
    public List getBlocks() {
        return blocks;
    }

    @Override
    public String getColor() {
        return blocks.stream().findFirst().orElseThrow().getColor();
    }

    @Override
    public String getMaterial() {
        return blocks.stream().findFirst().orElseThrow().getMaterial();
    }
}

