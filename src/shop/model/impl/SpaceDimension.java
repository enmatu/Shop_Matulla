package shop.model.impl;

import shop.model.Space;

public class SpaceDimension implements Space {
    private int width;
    private int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width <= 0 || width > 100) {
            System.err.println("width should not be 0 or higher than 100");
        } else this.width = width;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        if (height <= 0 || height >= 100) {
            System.err.println("height should not be 0 or higher than 100");
        } else this.height = height;
    }
}
