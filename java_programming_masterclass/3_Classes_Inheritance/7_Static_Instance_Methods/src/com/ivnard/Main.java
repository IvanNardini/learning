package com.ivnard;

public class Main {

    public static void main(String[] args) {
        // Static methods
        Calculator.printSum(5,10);
        printHello();

        // Instance methods
        Dog rex = new Dog(); // instantiate
        rex.bark(); // call instance method
    }

    public static void printHello(){
        System.out.println("Hello!");
    }

    /*
    STATIC OR INSTANCE METHOD?
    DOES THE METHOD USE INSTANCE VARIABLES or METHODS?
    YES --> INSTANCE METHOD
    NO --> STATIC METHOD
     */
}
