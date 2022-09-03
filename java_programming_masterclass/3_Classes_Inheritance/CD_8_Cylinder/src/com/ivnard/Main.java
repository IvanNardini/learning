package com.ivnard;

public class Main {

    public static void main(String[] args) {

//      TEST EXAMPLE

//        TEST CODE:

        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());

        /*

        OUTPUT

        circle.radius= 3.75
        circle.area= 44.178646691106465
        cylinder.radius= 5.55
        cylinder.height= 7.25
        cylinder.area= 96.76890771219959
        cylinder.volume= 701.574580913447

        */


    }
}
