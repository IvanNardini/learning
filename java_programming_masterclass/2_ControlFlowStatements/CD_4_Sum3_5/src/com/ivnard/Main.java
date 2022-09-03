package com.ivnard;

public class Main {

    public static void main(String[] args) {

        int SUM = 0;
        int COUNT = 0;

        // Create a for statement using a range of numbers from 1 to 1000 inclusive.
        for (int i=1;i <= 1000; i++){
            // Sum all the numbers that can be divided with both 3 and also with 5.
            if ((i % 3 == 0) && (i % 5 == 0)) {
                COUNT += 1;
                // For those numbers that met the above conditions, print out the number.
                System.out.println("Number found : " + i);
                SUM += i;
            }
            // break out of the loop once you find 5 numbers that met the above conditions.
            if (COUNT == 5){
                break;
            }
        }
        // After breaking out of the loop print the sum of the numbers that met the above conditions.
        System.out.println("The sum is equal to: " + SUM);
    }
}
