package com.ivnard;

public class Main {

    public static void main(String[] args) {

        //TEST
        Wall wall = new Wall(5,4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());

        //OUTPUT:
//        area= 20.0
//        width= 5.0
//        height= 0.0
//        area= 0.0
    }
}
