package com.ivnard;
//where public is access modifier and because public means every other classes can access to Car

public class Car {

    // field or variables you can access everywhere in the class
    // they define the state of the Car
    private int doors;
    private int wheels;
    //public String model; // that's no the best way to define access the data and define the state
    private String model; //notice we have a class (String) in a class (Car)
    private String engine;
    private String color;

    //The best way to go is define a method to access the data
    // Reasons are:
    // 1 - Define Validation
    // Access modifier setter
    public void setModel(String model){
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("alfa")){
            // but problem 1: same class two data (model, model) with same name;
            // to solve it use this
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    //problem 2: we can't print anything
    //we have to create a getter
    public String getModel(){
        return this.model;
    }
}
