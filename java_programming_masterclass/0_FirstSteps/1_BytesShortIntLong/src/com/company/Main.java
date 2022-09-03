package com.company;

public class Main {

    public static void main(String[] args) {

        // int is the default type in Java
        int myValue = 10000;
        // print the max and the min value int primitive class can store;
        // notice Integer is an example of Wrapper class ie a class to operate with int type
        int MyMinIntValue = Integer.MIN_VALUE;
        int MyMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + MyMinIntValue);
        System.out.println("Integer Maximum Value = " + MyMaxIntValue);

        // This is an example of Overflow (or Underflow)
        // It's when an arithmetic operation attempts to create a numeric value
        // that is outside of the range that can be represented with a given number of digits
        // In this case = max value + 1 --> min value
        System.out.println("Busted MAX value = " + (MyMaxIntValue + 1));
        System.out.println("Busted min value = " + (MyMinIntValue -1));

        //Side note: you can indicate int with _
        int myMaxIntTest = 3_333_222;

        //Work with Byte
        byte myMinByte = Byte.MIN_VALUE;
        byte myMaxByte = Byte.MAX_VALUE;
        System.out.println("Byte Min value " + myMinByte);
        System.out.println("Byte Max value " + myMaxByte);

        //Work with short
        short myMinshort = Short.MIN_VALUE;
        short myMaxshort = Short.MAX_VALUE;
        System.out.println("short Min value " + myMinshort);
        System.out.println("short Max value " + myMaxshort);

        //Work with long
        long myLongValue = 100L;
        long myMinlong = Long.MIN_VALUE;
        long myMaxlong = Long.MAX_VALUE;
        System.out.println("long Min value " + myMinlong);
        System.out.println("long Max value " + myMaxlong);

        // Add L to convert a int too long type in a long type
        long BigLongLiteralValue = 3_333_222_111L;
        System.out.println("Test Int Long type " + BigLongLiteralValue);

        // This is an example of casting
        // byte myNewByteValue = (myMinByte / 2); you get an error 
		// cause (myMinByte / 2) is an int which is greater than byte;
		// you have to cast (Widening Casting)
        byte myNewByteValue = (byte) (myMinByte / 2);
        System.out.println(myNewByteValue);
        short myNewShortValue = (short) (myMinshort / 2);
        System.out.println(myNewShortValue);
    }
}
