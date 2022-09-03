package com.company;

public class Main {

    public static void main(String[] args) {
        /*
        So far, I practice Primitive types:
        byte
        short
        int --> common
        long
        float
        double --> common
        char
        boolean --> boolean

        Now you can create a DataType as Class.
        An example is String.
        And a String is a sequence of characters.

         */
        // AN example of string
        String string = "This is a string";
        System.out.println(string);

        //String and operator
        String append = string + " and we append this";
        System.out.println(append);

        //String and different primitives
        String string_uni = append  + " \u003D\u0029";
        System.out.println(string_uni);

        String string_int = "250.55";
        string_int = string_int + "250";
        System.out.println(string_int); //of course does not sum
        // but also
        String last_string = "This is a number ";
        int number = 10;
        last_string = last_string + number;
        System.out.println(last_string);

        //same with double
        double doublenum = 10.55d;
        last_string = last_string + doublenum;
        System.out.println(last_string);

        /*
        IMPORTANT: Strings in Java are immutable
        YOU CANT CHANGE A STRING ONCE IT'S CREATED
        JAVA CREATE A NEW STRING AUTOMATICALLY

        Also appending is not JAVA recommended practice.
         */
    }
}
