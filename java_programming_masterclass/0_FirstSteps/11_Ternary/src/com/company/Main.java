package com.company;

public class Main {

    public static void main(String[] args) {

        /*
        The ternary operator ?: is a shortcut for
        if-then-else conditional statement
         */

        // An example of Ternary ?:
        boolean isCar = true;
        boolean wasCar = isCar ? true : false; //is isCar true if not set false
        if(wasCar){ // if true-->it will not print
            System.out.println(wasCar);
        }

        // Let's make a bit complicated
        int myAge = 28;
        boolean isEnghteenorOver = (myAge==20?true:false); //false
        if (isEnghteenorOver){ // not true
            System.out.println("you're still young!"); //no print
        }
    }
}
