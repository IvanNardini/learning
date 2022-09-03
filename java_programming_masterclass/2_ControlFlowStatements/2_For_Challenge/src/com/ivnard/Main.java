package com.ivnard;

public class Main {

    public static void main(String[] args) {
        // Create a for statement using any range of numbers
        // Determine if the number is a prime number using the isPrime method
        // if it is a prime number, print it out AND increment a count of the
        // number of prime numbers found
        // if that count is 3 exit the for loop
        // hint:  Use the break; statement to exit
        int COUNT = 0;
        for (int i = 10; i <= 50; i++) {
            if (isPrime(i)) {
                COUNT += 10;
                System.out.println(i);
                if (COUNT == 3){
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int n){

        if (n == 1) {
            return false;
        }
        //for (int i = 2; i <= n / 2; i++) {
        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
           // System.out.println("Loop" +i);
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
