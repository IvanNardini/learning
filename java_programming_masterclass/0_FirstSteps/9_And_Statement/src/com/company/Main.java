package com.company;

public class Main {

    public static void main(String[] args) {
        // AND operator

        int TOPSCORE = 100;
        // equal operator
        if (TOPSCORE == 100) {
            System.out.println("You got the high score!");
        }
        // not equal operator
        if (TOPSCORE != 100) {
            System.out.println("You got the high score!");
        }
        // greater or equal
        if (TOPSCORE >= 100) {
            System.out.println("You got the high score!");
        }

        // lower or equal
        if (TOPSCORE <= 100) {
            System.out.println("You got the high score!");
        }

        // lower or equal
        if (TOPSCORE < 100) {
            System.out.println("You got the high score!");
        }

        int SECONDSCORE = 80;
        if (SECONDSCORE < 100) { // lower operator
            System.out.println("You got a lower score!");
        }

        int THIRDSCORE = 60;
        if (SECONDSCORE > THIRDSCORE && TOPSCORE == 100) { //&& is the AND logical operator
            System.out.println("You got a score better than second one anyway");
        }
        // use inner parenthesis to make more clear
        if ((THIRDSCORE > THIRDSCORE) && (TOPSCORE == 100)) { // && logical, & bitwise works at bit level
            System.out.println("You got a score better than second one anyway");
        }

       if ((TOPSCORE > 90) || (SECONDSCORE <= 90)) { // || the OR operator
           System.out.println("You got a score less than 90 Top score");
       }
    }
}
