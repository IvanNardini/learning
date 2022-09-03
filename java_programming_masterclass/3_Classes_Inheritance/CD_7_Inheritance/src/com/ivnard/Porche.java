package com.ivnard;

public class Porche extends Car{
    private int roadServiceMonths;

    public Porche(int roadServiceMonths) {
        super("Carrera", "4", 4, 2, 4, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate){
        int newSpeed = getCurrent_speed() + rate;
        if (newSpeed == 0){
            stop();
            Change_Gear(1);
        } else if(newSpeed >0 && newSpeed<=10) {
            Change_Gear(1);
        } else if (newSpeed >10 && newSpeed<=20) {
            Change_Gear(2);
        } else if (newSpeed >20 && newSpeed<=30) {
            Change_Gear(3);
        } else {
            Change_Gear(4);
        }
        if (newSpeed > 0){
            Change_Speed(newSpeed, getCurrent_direction_angle());
        }
    }

    public int getRoadServiceMonths() {
        return roadServiceMonths;
    }

    public void setRoadServiceMonths(int roadServiceMonths) {
        this.roadServiceMonths = roadServiceMonths;
    }
}
