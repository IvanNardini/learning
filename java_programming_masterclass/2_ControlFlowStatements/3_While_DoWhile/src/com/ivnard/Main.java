package com.ivnard;

public class Main {

    /*
     When you don't know the length of the loop
     It's time for use While
     */

    public static void main(String[] args) {

        System.out.println("while statement");
        int COUNT = 0;
        while(COUNT != 5){ //no variable needs to be declared!
            System.out.println(COUNT);
            COUNT++;
        }

        // With if...
        System.out.println("if statement");

        for(int i=0; i <= 5; i++){
            if (i != 5){
                System.out.println(i);
            }
        }

        //More precisely...
        System.out.println("if and count");
        for(COUNT=0;  COUNT<= 5; COUNT++){
            if (COUNT != 5){
                System.out.println(COUNT);
            }
        }

        // Another way to do the same
        COUNT = 0;
        while (true) { //We use this because sometimes the expression is always false.
            if (COUNT==5){
                break;
            }
            System.out.println(COUNT);
            COUNT ++;
        }

        // Also it is possible to run at least one loop
        COUNT = 0;
        //do this
        do {
            System.out.println(COUNT);
            COUNT ++;
        }while(COUNT != 6); //while that

        //Just a note: do-while has a bug as well
        //COUNT = 6;
        //do {
           //System.out.println(COUNT);
           //COUNT ++;
        //}while(COUNT != 6);

        COUNT = 6;
        do {
            System.out.println(COUNT);
            COUNT++;
            if(COUNT >100){
                break;
            }
        } while(COUNT!=6);
    }
}
