package com.ivnard;

public class Main {

    public static void main(String[] args) {

        int START = 1;
        int END = 30;
        int COUNT = 0;
        int SUM = 0;

        // Modify the while code
        // Make it also record the total number of even numbers it has found
        // and break once 5 are found
        // and at the end, display the total number of even numbers found

        while (START <= END){
            START ++;
            if(!isEvenNumber(START)){
                continue;
            }
            COUNT ++;
            SUM += START;
            System.out.println(SUM);
            if (COUNT >= 5){
                break;
            }
        }
    }

    // Create a method called isEvenNumber that takes a parameter of type int
    // Its purpose is to determine if the argument passed to the method is
    // an even number or not.
    // return true if an even number, otherwise return false;

    public static boolean isEvenNumber(int number){
        return number % 2 == 0;
    }
}
