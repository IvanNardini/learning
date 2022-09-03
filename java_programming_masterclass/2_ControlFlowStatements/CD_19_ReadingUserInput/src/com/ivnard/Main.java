package com.ivnard;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        // Read 10 numbers from the console entered by the user and print the sum of those numbers.
        // Create a Scanner like we did in the previous video.
        //while (true) {
        while(count < 10){
            int order = count + 1;
            // Use the hasNextInt() method from the scanner to check if the user has entered an int value.
            System.out.println("Enter number #" + order + ":");

            boolean hasNextInt = scanner.hasNextInt();
            // If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read 10 numbers.
            if (hasNextInt) {
                //Use the nextInt() method to get the number and add it to the sum.
                int number = scanner.nextInt();
                count++;
                sum += number;
//                if (count == 10) {
//                    break;
//                }
            } else {
                System.out.println("Invalid Number");
            }

            scanner.nextLine(); // handle the end of line (enter key)
        }
        scanner.close();
        System.out.println(sum);
    }
}
