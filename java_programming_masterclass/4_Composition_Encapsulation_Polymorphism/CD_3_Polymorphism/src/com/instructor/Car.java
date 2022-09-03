package com.instructor;

public class Car {
    private String name;
    private int cylinders;
    private int wheels;
    private boolean engine;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }

    public String startEngine(){
        return "Engine starts!";
    }

    public String accelerate(){
        return "Car accelerate!";
    }

    public String brake(){
        return "Car brakes!";
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }
}