package com.ivnard.Kitchen;

public class Hob {

    //Attributes
    private String brand;
    private String model;
    private int numberofstove;
    private boolean iselectric;

    //Constructor
    public Hob(String brand, String model, int numberofstove, boolean iselectric) {
        this.brand = brand;
        this.model = model;
        this.numberofstove = numberofstove;
        this.iselectric = iselectric;
    }

    public void powerON(){
        System.out.println("The Hob is ON!");
    }

    public void upstove(int numberofflames){
        System.out.println("Incresed by " + numberofflames);
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

    public int getNumberofstove() {
        return numberofstove;
    }

    public void setNumberofstove(int numberofstove) {
        this.numberofstove = numberofstove;
    }

    public boolean isIselectric() {
        return iselectric;
    }

    public void setIselectric(boolean iselectric) {
        this.iselectric = iselectric;
    }
}
