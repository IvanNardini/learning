package com.instructor;

public class Ford extends Car{
    public Ford(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Ford starts!";
    }

    @Override
    public String accelerate() {
        return "Ford accelerate!";
    }

    @Override
    public String brake() {
        return "Ford brakes!";
    }
}
