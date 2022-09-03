package com.instructor;

public class Holden extends Car{
    public Holden(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Holden starts!";
    }

    @Override
    public String accelerate() {
        return "Holden accelerate!";
    }

    @Override
    public String brake() {
        return "Holden brakes!";
    }
}
