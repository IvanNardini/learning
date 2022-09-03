package com.ivnard;

public class Main {

    // The Swimming Company has asked you to write an application
    // that calculates the volume of cuboid shaped pools.

    public static void main(String[] args) {
        // TEST EXAMPLE

        // TEST CODE
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());
        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());

//        OUTPUT
//        rectangle.width= 5.0
//        rectangle.length= 10.0
//        rectangle.area= 50.0
//        cuboid.width= 5.0
//        cuboid.length= 10.0
//        cuboid.area= 50.0
//        cuboid.height= 5.0
//        cuboid.volume= 250.0


    }
}
