package com.ivnard;

import java.util.Scanner;

public class Main {

//    public static void main(String[] args) {
//        // Scanner is a built-in and it's for reading user input
//        // new is for creating an Instance of Scanner
//        // pass primitive types to Scanner
//        Scanner scanner = new Scanner(System.in);
//
//
//        System.out.println("Enter you YOB: ");
//        int yob = scanner.nextInt();
//        scanner.nextLine(); // after an next_number you need a nextLine();
//                            // because internally it checks for line separator and enter key
//                            // becomes the input. That's why it skips.
//
//        System.out.println("Enter your name: ");
//        String name = scanner.nextLine(); //nextLine is for String datatype;
//        // Calculate age
//        int age = 2020 - yob;
//        System.out.println("Your name is " + name + " and you are " + age + " old");
//        // Close scanner instance
//        scanner.close();

        // Some couple of considerations
        // 1-negative number
        // 2-string input when number expected

    public static void main(String[] args) {
        // Scanner is a built-in and it's for reading user input
        // new is for creating an Instance of Scanner
        // pass primitive types to Scanner
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter you YOB: ");
        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt) {
            int yob = scanner.nextInt();
            scanner.nextLine(); // after an next_number you need a nextLine();
            // because internally it checks for line separator and enter key
            // becomes the input. That's why it skips.

            System.out.println("Enter your name: ");
            String name = scanner.nextLine(); //nextLine is for String datatype;
            // Calculate age
            int age = 2020 - yob;

            if ((age > 0) && (age < 100)) {
                System.out.println("Your name is " + name + " and you are " + age + " old");
            } else {
                System.out.println("Invalid Year value!");
            }
            // Close scanner instance
            scanner.close();
        } else {
            System.out.println("Invalid YOB value!");
        }
    }
}
