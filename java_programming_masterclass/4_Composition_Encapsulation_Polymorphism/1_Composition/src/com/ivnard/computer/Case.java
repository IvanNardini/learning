package com.ivnard.computer;

public class Case {
    private String model;
    private String brand;
    private String powerSupply;
    private Dimensions dimensions; //Case has Dimentions

    public Case(String model, String brand, String powerSupply, Dimensions dimensions) {
        this.model = model;
        this.brand = brand;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }

    public void pressPowerButtom(){
        System.out.println("Power button pressed");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }
}
