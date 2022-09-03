package com.ivnard.Kitchen;

public class Table {

    //Attributes
    private String brand;
    private String model;
    private String shape;
    private boolean isWood;

    //Constructor
    public Table(String brand, String model, String shape, boolean isWood) {
        this.brand = brand;
        this.model = model;
        this.shape = shape;
        this.isWood = isWood;
    }

    //Getter and Setters

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

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public boolean isWood() {
        return isWood;
    }

    public void setWood(boolean wood) {
        isWood = wood;
    }
}
