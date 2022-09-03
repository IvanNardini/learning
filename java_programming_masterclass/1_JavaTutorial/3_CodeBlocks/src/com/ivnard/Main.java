package com.ivnard;

public class Main {

    public static void main(String[] args) {
        boolean GAMEOVER = true;
        int SCORE = 800;
        int LEVELCOMPLETED = 5;
        int BONUS = 100;

//        if(SCORE==5000){
//           System.out.println("Your score is 5000!");
//        }
//
//        //The same if we have just one statement!
//        if(SCORE<5000)
//            System.out.println("Your score is 5000!");

//        if(SCORE<5000 && SCORE>1000){
//            System.out.println("Your score between 5000 and 1000!");
//        }
//        else if(SCORE < 1000){
//            System.out.println("Your score is less than 1000");
//        }
//        else{
//            System.out.println("Got here!");
//        }

        if (GAMEOVER){
            int FINALSCORE = SCORE + (LEVELCOMPLETED*BONUS);
            System.out.println("Your final score is " + FINALSCORE);
        }

        // Notice: Variables in the code block are local scope;
        // int STORE_FINALSCORE = FINALSCORE // is wrong


        /*
        CHALLENGE: Print out a second score with
        - SCORE = 10000
        - LEVELCOMPLETED = 8
        - BONUS = 200
         */

        // Solution 1
//        boolean NEW_GAMEOVER = true;
//        int NEW_SCORE = 10000;
//        int NEW_LEVELCOMPLETED = 8;
//        int NEW_BONUS = 200;
//
//        if (NEW_GAMEOVER){
//            int NEW_FINALSCORE = NEW_SCORE + (NEW_LEVELCOMPLETED*NEW_BONUS);
//            System.out.println("Your Final score is " + NEW_FINALSCORE);
//        }

        // Solution 2
        SCORE = 10000; // we don't need int to declare a new variable
        LEVELCOMPLETED = 8;
        BONUS = 200;

        if (GAMEOVER){
            int FINALSCORE = SCORE + (LEVELCOMPLETED*BONUS);
            System.out.println("Your final score is " + FINALSCORE);
        }

        // The problem of solution 2 is code duplication.
        // To reduce it, let' introduce METHODS
    }
}
