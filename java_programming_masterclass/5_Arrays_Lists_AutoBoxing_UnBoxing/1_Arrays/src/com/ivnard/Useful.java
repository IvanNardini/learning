package com.ivnard;

import java.util.Scanner;

public class Useful {

    private static Scanner scanner = new Scanner(System.in);

    public static void printer(){
        int[] integers = getIntegers(5);
        for (int i =0; i<integers.length; i++){
            System.out.println("Element " + i + " Value " + integers[i]);
        }
        System.out.println(getAverage(integers));
    }

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values");
        int[] values = new int[number];
        for (int i=0; i < values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for(int i=0; i<array.length; i++){
            sum += array[i];
        }
        return (double) sum/ (double) array.length;
    }
}
