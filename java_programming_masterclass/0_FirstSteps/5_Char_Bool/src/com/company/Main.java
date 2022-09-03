package com.company;

public class Main {

    public static void main(String[] args) {

        /*
        char is different to string --> just one character;
        It occupies 2 bytes --> 16 bits (16 width).
        That's because you have to store UNICODE characters;
         */

        char mychar = 'D';
        //same D in unicode
        char myunicodechar = '\u0044';
        System.out.println(mychar);
        System.out.println(myunicodechar);

        char copyright = '\u00A9';
        System.out.println(copyright);

        /*
        boolean in java has two values true or false;
         */

        boolean mybool_true = true;
        boolean mybool_false = false;
        System.out.println(mybool_false);
        System.out.println(mybool_true);

        //it is used to provide answers
        //best practice name variables with question =)
        boolean isCustomermale = true;
        System.out.println(isCustomermale);
        

    }
}
