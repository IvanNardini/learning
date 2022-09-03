package com.ivnard;

// Create a program using arrays that sorts a list of integers in descending order.
// Descending order is highest value to lowest.
// In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
// ultimately have an array with 106,81,26, 15, 5 in it.
// Set up the program so that the numbers to sort are read in from the keyboard.
// Implement the following methods - getIntegers, printArray, and sortIntegers
// getIntegers returns an array of entered integers from keyboard
// printArray prints out the contents of the array
// and sortIntegers should sort the array and return a new array containing the sorted numbers
// you will have to figure out how to copy the array elements from the passed array into a new
// array and sort them and return the new sorted array.

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    // Private field
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] values = getIntegers(5);
        sortIntegers(values);
        printArray(values);
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        scanner.close();
        return values;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + array[i] + " at position " + i);
        }
    }

//    public static void sortIntegers(int[] array){
//        Arrays.sort(array, Collections.reverseOrder());
//    }

    public static int[] sortIntegers(int[] array) {
        // Create a copy of original array
//        int[] sortedArray = new int[array.length];
//        for (int i = 0; i < array.length; i++) {
//            sortedArray[i] = array[i];
//        }
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp_value;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {    // [1,2]
                if (sortedArray[i] < sortedArray[i + 1]) {     // if 1 < 2
                    temp_value = sortedArray[i];          // store the value
                    sortedArray[i] = sortedArray[i + 1];   // swap the value --> 2 becomes element 0
                    sortedArray[i + 1] = temp_value;      // 1 becomes element 1
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}

