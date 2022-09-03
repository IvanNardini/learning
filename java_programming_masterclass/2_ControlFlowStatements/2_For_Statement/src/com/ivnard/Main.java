package com.ivnard;

public class Main {

    public static void main(String[] args) {
//        System.out.println(calculateInterest(10000, 2));
//        System.out.println(calculateInterest(10000, 3));
//        System.out.println(calculateInterest(10000, 4));
//        System.out.println(calculateInterest(10000, 5));

        // To much repetitive
        // That's why for loop statement
        // for (init; termination; increment) { some code }

        for (int i = 1; i < 10; i++) {
            //System.out.println("Interest rate : " + i + " %");
            System.out.println(String.format("%.2f", calculateInterest(10000, (double) i)));
        }

        System.out.println("Reversing Interest Rate scale...");
        // Assume we want to reverse the scale
        for (int i = 9; i > 0; i--) {
            //System.out.println("Interest rate : " + i + " %");
            System.out.println(String.format("%.2f", calculateInterest(10000, (double) i)));
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount*(interestRate/100));
    }
}
