package com.ivnard;

public class Main {

    public static void main(String[] args) {
        double CENTIMETERS = calcFeetAndInchesToCentimeters(1.0, 1.0);
        if (CENTIMETERS < 0){
            System.out.println("Invalid parameters!");
        }
        calcFeetAndInchesToCentimeters(100);
        calcFeetAndInchesToCentimeters(156);
        calcFeetAndInchesToCentimeters(-13);
    }

    // Create a method called calcFeetAndInchesToCentimeters
    // It needs to have two parameters.
    // feet is the first parameter, inches is the 2nd parameter
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        // You should validate that the first parameter feet is >= 0
        // You should validate that the 2nd parameter inches is >=0 and <=12
        // return -1 from the method if either of the above is not true
        if ((feet < 0) || (inches < 0 || inches > 12)) {
            System.out.println("feet or inches parameters are invalid!");
            return -1;
        }

        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
        return centimeters;

    }

    // Create a 2nd method of the same name but with only one parameter
    // inches is the parameter
    public static double calcFeetAndInchesToCentimeters(double inches) {
        // validate that its >=0
        // return -1 if it is not true
        if(inches < 0) {
            System.out.println("Invalid Parameter!");
            return -1;
        }

        // But if its valid, then calculate how many feet are in the inches
        // and then here is the tricky part
        // call the other overloaded method passing the correct feet and inches
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
}
