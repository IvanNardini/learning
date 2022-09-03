package com.ivnard.Kitchen;

public class Chairs {

    //Attributes
    private String brand;
    private String model;
    private boolean isWood;

    //Constructor

    public Chairs(String brand, String model, boolean isWood) {
        this.brand = brand;
        this.model = model;
        this.isWood = isWood;
    }

    //Getter and Setter

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isWood() {
        return isWood;
    }

    public void setWood(boolean wood) {
        isWood = wood;
    }
}
