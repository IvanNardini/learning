package com.ivnard;

public class Vehicle {
    // Static attribute
    private String name;
    private String size;
    private int current_speed;
    private int current_direction_angle;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.current_speed = 0;
        this.current_direction_angle = 0;
    }

    public void steer(int current_direction_angle){
        this.current_direction_angle = current_direction_angle;
        System.out.println("Car's steering of " + current_direction_angle + "° degrees");
    }

    public void move( int current_speed, int current_direction_angle){
        this.current_direction_angle = current_direction_angle;
        this.current_speed = current_speed;
        System.out.println("Car's steering of " + current_direction_angle + "° degrees " + "at " + current_speed + " km/h");
    }

    public void stop(){
        this.current_speed = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getCurrent_speed() {
        return current_speed;
    }

    public void setCurrent_speed(int current_speed) {
        this.current_speed = current_speed;
    }

    public int getCurrent_direction_angle() {
        return current_direction_angle;
    }

    public void setCurrent_direction_angle(int current_direction_angle) {
        this.current_direction_angle = current_direction_angle;
    }
}
