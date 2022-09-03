package com.ivnard;

public class Porche extends Car {
    public Porche() {
        super("Porche", 18);
    }

    @Override
    public void startEngine() {
        System.out.println("Porche starts!");
    }
}
