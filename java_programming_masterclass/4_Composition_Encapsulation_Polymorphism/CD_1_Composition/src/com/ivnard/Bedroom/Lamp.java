package com.ivnard.Bedroom;

public class Lamp {

    private String style;
    private boolean hasbattery;
    private int globRating;

    public Lamp(String style, boolean hasbattery, int globRating) {
        this.style = style;
        this.hasbattery = hasbattery;
        this.globRating = globRating;
    }

    public void turnOn(){
        System.out.println("The lamp is ON!");
    }

    public String getStyle() {
        return style;
    }

    public boolean isHasbattery() {
        return hasbattery;
    }

    public int getGlobRating() {
        return globRating;
    }
}
