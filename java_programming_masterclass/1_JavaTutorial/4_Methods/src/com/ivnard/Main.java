package com.ivnard;

public class Main {

    //this is an example of method: main
    public static void main(String[] args) {

        // Global variables
        boolean GAMEOVER = true;
        int SCORE = 800;
        int LEVELCOMPLETED = 5;
        int BONUS = 100;

//        CalculateScore(GAMEOVER, SCORE, LEVELCOMPLETED, BONUS);
//        CalculateScore(true, 10000, 8, 200);

        int FS1 = ReturnScore(GAMEOVER, SCORE, LEVELCOMPLETED, BONUS);
        int FS2 = ReturnScore(true, 10000, 8, 200);

        System.out.println(FS1);
        System.out.println(FS2);

    }

    // Define a new method CalculateScore
//    public static void CalculateScore(boolean GAMEOVER, int SCORE, int LEVELCOMPLETED, int BONUS){
//        if (GAMEOVER) {
//            int FINALSCORE = SCORE + (LEVELCOMPLETED * BONUS);
//            FINALSCORE += 1000;
//            System.out.println("Your final score is " + FINALSCORE);
//        }
//    }

    // Now we define a method for printing but what if we want to return value?
    // void specifies that a method should not have a return value.
    // So delete void!
    public static int ReturnScore(boolean GAMEOVER, int SCORE, int LEVELCOMPLETED, int BONUS){ // 1) Need to declare the data type to return;
        if (GAMEOVER) {
            int FINALSCORE = SCORE + (LEVELCOMPLETED * BONUS);
            FINALSCORE += 1000;
            return FINALSCORE; // 2) Add the return statement;
        }
        return -1; // 3) No matter what Java expected a return statement for the return method (-1 is conventional error in programming)
    }
}
