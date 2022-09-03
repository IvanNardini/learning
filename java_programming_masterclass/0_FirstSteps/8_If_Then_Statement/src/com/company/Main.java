package com.company;

public class Main {

    public static void main(String[] args) {
        /*
        if-then is the 1st control flow statement
        It executes a code only if a particular test
        results true.

        It's a conditional logic.
        */

        boolean isAlien = false;
        if (isAlien == false) // == identical operators
            System.out.println("It is not an alien!"); //; closes the statement
        System.out.println("End");
        // Notice this strange behaviour
        if (isAlien == true) // == identical operators
            System.out.println("It is not an alien!");
        System.out.println("I'm scared of aliens.");
        System.out.println("End");
        // We expect no printing. But...
        // That's confusing behaviour needs a workaround...

        /*
        Code Block which allows more than one statement to be executed;

        SYNTAX
        if (condition statement) {
        // statement 1
        // statement 2
        }
         */

        if (isAlien==false) {
            System.out.println("It is not an alien!");
            System.out.println("I'm scared of aliens.");
        }

    }
}
