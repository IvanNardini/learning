package com.ivnard;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {

    public static void main(String[] args) {

        String numberasString = "2018";
        System.out.println(numberasString);
        // To convert a string with number in an number
        int number = Integer.parseInt(numberasString);
        System.out.println(number);

        // When we want to modify the number
        number += 1;
        System.out.println(number);

        //Else convert an number in a string
        numberasString += 1;
        System.out.println(numberasString);

        //The same can be done with different data type...
        String doubleasString = "20.2020";
        double double_number  = Double.parseDouble(doubleasString);
        System.out.println(double_number);
    }
}
