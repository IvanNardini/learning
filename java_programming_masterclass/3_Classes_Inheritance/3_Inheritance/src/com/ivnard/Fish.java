package com.ivnard;

public class Fish extends Animal{
    //Instance variables
    private int gills;
    private int eyes;
    private int fins;

    //Constructor (with the one inherited)
    public Fish(String name, int size, int weight,int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    //fish rests
    private void rest(){

    }

    //fish moves muscles
    private void moveMuscles(){

    }

    //fish moves back fin
    private void moveBackFin(){

    }

    //fish swims
    private void swim(int speed){
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }



}
