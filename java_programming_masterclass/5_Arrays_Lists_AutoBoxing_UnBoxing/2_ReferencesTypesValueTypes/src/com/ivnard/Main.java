package com.ivnard;

import java.util.Arrays;

// Value Type
//A data type is a value type if it holds a data value within its own memory space.
// It means the variables of these data types directly contain values

// Reference Type
// Unlike value types, a reference type doesn't store its value directly.
// Instead, it stores the address where the value is being stored.
// In other words, a reference type contains a pointer to another memory location that holds the data.

// Then for Value Type if you modify the reference, you don't modify the object in memory. You modify the reference.
// For reference type if you modify the reference, you modify the object in memory. Then different reference, same
// modified object.

public class Main {

    public static void main(String[] args) {

        int ten = 10;
        int anotherTen = ten;

        System.out.println(ten);
        System.out.println(anotherTen);

        anotherTen++;

        System.out.println(ten);
        System.out.println(anotherTen);

        // Let's do the same with array
        int[] array = new int[5]; //it's a reference to array object in memory
        int[] anotherArray = array; //it's a reference of a reference to array object in memory

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(anotherArray));

        anotherArray[0] = 1;

        System.out.println(Arrays.toString(array)); // [1, 0, 0, 0, 0]
        System.out.println(Arrays.toString(anotherArray)); //[1, 0, 0, 0, 0]

        changeArray(array); //pass reference type to method. it creates a new reference array
        System.out.println(Arrays.toString(array)); //both point to new array reference
        System.out.println(Arrays.toString(anotherArray));

        //the same works with deferencing...
        anotherArray = new int[] {8,7,6,5,4};
        System.out.println(Arrays.toString(array)); //both point to new array reference
        System.out.println(Arrays.toString(anotherArray));
    }

    // Let's define change method
    private static void changeArray(int[] array) {
        array[0] = 3;
        array = new int[] {1,2,3,4,5};

    }
}
