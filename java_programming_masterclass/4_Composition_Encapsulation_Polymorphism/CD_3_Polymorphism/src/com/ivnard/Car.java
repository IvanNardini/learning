package com.ivnard;

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

    public void startEngine(){
        System.out.println("Engine starts!");
    }

    public void accelerate(){
        System.out.println("Car accelerate");
    }

    public void brake(){
        System.out.println("Car brakes");
    }
    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isEngine() {
        return engine;
    }
}
