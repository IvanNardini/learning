package com.ivnard;

public class Car extends Vehicle{
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;
    private int current_gears;

    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.current_gears = 1;
    }

    public void Change_Gear(int current_gears) {
        this.current_gears = current_gears;
        System.out.println("Setting current gear. New gear is " + this.current_gears);
    }

    public void Change_Speed(int speed, int direction){
        move(speed, direction);
        System.out.println("Changing car speed. New car speed is " + speed + " with direction " + direction);
    }
}
