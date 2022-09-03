package com.ivnard;

public class Ferrari extends Car{
    public Ferrari() {
        super("Ferrari", 20);
    }

    @Override
    public void startEngine() {
        System.out.println("Ferrari starts!");;
    }
}
