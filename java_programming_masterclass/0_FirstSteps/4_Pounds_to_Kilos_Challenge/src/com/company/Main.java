package com.company;

public class Main {

    public static void main(String[] args) {
        // Create a variable to store pounds
        double pounds = 170d;

        // Create an expression variable to convert kilos
        double kilos = pounds * (0.45359237d);

        //sout
        System.out.println(kilos);

        //remember you can always use underscore
        double d_under = 10_10_10.5_2_1d;
        double d = 101010.521d;
        //they are the same
        System.out.println(d_under);
        System.out.println(d);
    }
}
