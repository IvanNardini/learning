package com.ivnard;

import java.lang.reflect.Constructor;

public class Main {

    public static void main(String[] args) {
        // Create a new instance of House class, where House is an object in memory;
        // bluehouse is the reference to that object.
        House bluehouse = new House("blue");
        // here we create another reference to the same object in memory
        House anotherhouse = bluehouse;

        System.out.println(bluehouse.getColor());
        System.out.println(anotherhouse.getColor());

        // we change the color of the object using anotherhouse reference
        anotherhouse.setColor("red");
        System.out.println(anotherhouse.getColor());
        // But becuase bluehouse refers to same object... dadan! it changes its color too
        System.out.println(bluehouse.getColor());

        House greenhouse = new House("green");
        anotherhouse = greenhouse;

        System.out.println(bluehouse.getColor()); // first object
        System.out.println(greenhouse.getColor()); //second object
        System.out.println(anotherhouse.getColor()); //second object


    }
}
