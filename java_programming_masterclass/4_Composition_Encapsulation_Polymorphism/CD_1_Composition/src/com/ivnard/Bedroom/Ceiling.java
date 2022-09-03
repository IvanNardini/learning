package com.ivnard.Bedroom;

public class Ceiling {
    //Attributes
    private int height;
    private int paintedColor;

    //Constructor
    public Ceiling(int height, int paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    //Getter
    public int getHeight() {
        return height;
    }

    public int getPaintedColor() {
        return paintedColor;
    }
}
