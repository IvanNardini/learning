package com.ivnard;

public class Main {

    public static void main(String[] args) {

        String PLAYERNAME = "Ivan";
        int HIGHSCOREPOSITION = CalculateHighScorePosition(1500);
        DisplayHighScorePosition(PLAYERNAME, HIGHSCOREPOSITION);
        HIGHSCOREPOSITION = CalculateHighScorePosition(900);
        DisplayHighScorePosition(PLAYERNAME, HIGHSCOREPOSITION);
        HIGHSCOREPOSITION = CalculateHighScorePosition(400);
        DisplayHighScorePosition(PLAYERNAME, HIGHSCOREPOSITION);
        HIGHSCOREPOSITION = CalculateHighScorePosition(50);
        DisplayHighScorePosition(PLAYERNAME, HIGHSCOREPOSITION);
    }

    // Create a method DisplayHighScorePosition
    // with player name parameter and high score table parameter
    public static void DisplayHighScorePosition(String PlayerName, int Score) {
        System.out.println(PlayerName + " managed to get into position " +
                            Score + " on the high score table ");
    }

    // Create a method CalculateHighScorePosition
    // with Score parameter only
    public static int CalculateHighScorePosition(int Score) {

//        if (Score >=1000) {
//            return 1;
//        } else if (Score >=500) {
//            return 2;
//        } else if (Score >=100) {
//            return 3;
//        }
//
//        return 4;

        // Don't like that solution cause many return

        // Set a return variable
        int POSITION = 4;

        if (Score >=1000) {
            POSITION = 1;
        } else if (Score >=500) {
            POSITION = 2;
        } else if (Score >=100) {
            POSITION =  3;
        }
        return POSITION;
    }
}