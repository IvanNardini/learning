package com.ivnard;

import java.util.Scanner;

public class InputCalculator {

//        Write a method called inputThenPrintSumAndAverage that does not have any parameters.
//        The method should not return anything (void) and it needs to keep reading int numbers from the keyboard.
//        When the user enters something that is not an int then it needs to print a message in the format "SUM = XX AVG = YY".
//        XX represents the sum of all entered numbers of type int.
//        YY represents the calculated average of all numbers of type long.

    public static void inputThenPrintSumAndAverage() {

        int count = 0;
        int sum = 0;
        long avg;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int number = scanner.nextInt();
                count++;
                sum += number;
            } else {
                break;
            }
            scanner.nextLine();
        }
        avg =Math.round((double)sum/count);
        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();
    }
}
