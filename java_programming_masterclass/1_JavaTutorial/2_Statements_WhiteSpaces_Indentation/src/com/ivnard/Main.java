package com.ivnard;

public class Main {

    public static void main(String[] args) {
        int VARIABLE = 50; //  VARIABLE = 50 is the expression. int VARIABLE = 50; is the statement
        VARIABLE++; // VARIABLE++; statement
        VARIABLE--; // VARIABLE--; statement
        System.out.println("The entire line is a statement");
        System.out.println("You can have a " +
                "multiline " +
                "statement"); // Java ends the statement with ;!

        // This implies you can put all in the same line
        String ONELINE="Ciao"; VARIABLE++; System.out.println("All in one line");

        // Java ignores WhiteSpaces
        String WHITESPACES         =
                "I have fun with whitespaces"
                                    ;

        // About Indentation, it's for a clear reading code.
        if (VARIABLE == 50){
            System.out.println("It's 50");
        }

    }
}
