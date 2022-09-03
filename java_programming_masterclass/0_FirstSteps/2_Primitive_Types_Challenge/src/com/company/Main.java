package com.company;

public class Main {

    public static void main(String[] args) {
        // Create a byte variable
        byte byte_number =  3;
        // Create a short variable
        short short_number = 6;
        // Create a int variable
        int int_number = 8;
        // Create a long variable as
        // long = 50000 + 10 * (byte + short + int)
        long long_expr = 50000L + 10L * (byte_number + short_number + int_number);
        //print
        System.out.println(long_expr);
    }
}
