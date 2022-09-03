package com.ivnard;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        CalculateScore("Ivan", 10);
        int NEWSCORE = CalculateScore(10);
        CalculateScore();
    }

    public static int CalculateScore(String Name, int Score){
        System.out.println(Name + " gets score " + Score);
        return Score*1000;
    }

    //This is an example of overload method
    //Overloading is a feature that allows a class
    // to have more than one method having the same name,
    // if their argument lists are different.
    // You need to create a unique signature (method name + parameters);

    public static int CalculateScore(int Score){
        System.out.println("Unamed player gets score " + Score);
        return Score;
    }

    public static int CalculateScore(){
        System.out.println("No Name. No Score");
        return 0;
    }

    /*
    // Changing type is not enough
    public static void CalculateScore(){
        System.out.println("No Name. No Score");
    }
    */


}
