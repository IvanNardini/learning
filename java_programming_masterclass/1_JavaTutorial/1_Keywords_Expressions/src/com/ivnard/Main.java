package com.ivnard;

public class Main {

    public static void main(String[] args) {
        // dont use keywords for variable
        int INT=5;

        /*
        Expressions are built-in with values, variables and operators
         */

        double kilometres = (100 * 1.609344); // kilometres = (100 * 1.609344 is an expression
        int HIGHSCORES = 50; //HIGHSCORES = 50 is an expression
        if(HIGHSCORES == 50){ // HIGHSCORES == 50 is an expression
            System.out.println("This is an expression"); //"This is an expression" is an expression
        }

        //Another example
        int SCORE = 100; //expression
        if (SCORE > 99){ //expression
            System.out.println("You got a great score!"); //expression
            SCORE = 0; //expression
        }
    }
}
