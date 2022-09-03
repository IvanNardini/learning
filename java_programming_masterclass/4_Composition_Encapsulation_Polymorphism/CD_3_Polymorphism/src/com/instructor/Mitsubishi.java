package com.instructor;

public class Mitsubishi extends Car{
    public Mitsubishi(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi starts!";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi accelerate!";
    }

    @Override
    public String brake() {
        return "Mitsubishi brakes!";
    }
}
