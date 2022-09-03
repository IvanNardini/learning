package com.ivnard;

public class Intro {

    public static void declare() {
        // To declare an array
        int var = 10;
        // int[] array;
        // array = new int[10];
        // Same as
        int[] array0 = new int[10]; // an array of 10 integers
    }

    public static void assign1() {
        int[] array0 = new int[10];
        //We can access to array
        array0[5] = 50; //Index comes from 0 to ...--> add element at 6
        //To print
        //System.out.println(array0[5]);

        //Of course we can assign value one by one (only one with the declared type)
        array0[0] = 1;
        array0[1] = 2; //tedious right

    }

    public static void assign2() {
        //Assign values to array
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // This looks like similar to for loop
        int[] array2 = new int[10];
    }

    public static void assign3() {
        //for (int i = 0; i < 10; i++){
        //    array2[i] = i;
        //    System.out.println(array2[i]);
        //}
        //As object, arrays have methods.
        int[] array3 = new int[10];
        for (int i = 0; i < array3.length; i++) {
            array3[i] = i;
           System.out.println(array3[i]);
        }
        // Useful when we don't know lenght
        // Easy to maintain
    }


    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            System.out.println(array[i]);
        }
    }
}
