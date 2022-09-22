package main.modules;

import java.util.Objects;

public class BlockEntity implements Block {
    private String color;
    private String material;

    public BlockEntity(String color, String material) {
        this.color = color;
        this.material = material;
    }


    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return "BlockEntity{" +
                "color='" + color + '\'' +
                ", material='" + material + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BlockEntity that = (BlockEntity) o;
        return Objects.equals(color, that.color) && Objects.equals(material, that.material);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, material);
    }
}
