package com.ivnard;

//This is an example of static method
// - use the static modifier
// - can't use them with data from instance of a class (this)
// - use with method that does not call instance variables

public class Calculator {

    public static void printSum(int x, int y) {
        System.out.println("sum = " + (x + y));
    }
}
