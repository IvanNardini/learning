package com.ivnard;

public class Main {
    // Create a new char variable
    private static final String SWITCH_VARIABLE = "I";
    private static final String SWITCH_VARIABLE_LOWER = "i";

    public static void main(String[] args) {
        // Create a new switch statement using char instead of int
        // Create a switch statement testing for A, B, C, D, or E
        switch(SWITCH_VARIABLE){
            case "A": case "B": case "C": case "D": case "E":
                // Display a message if any of these are found and then break
                System.out.println("Value is equal either A, B, C, D, or E");
                break;
            default:
                // Add a default which displays a message saying not found
                System.out.println("Not found!");
                break;
        }

        // In depth look: LOWER case and UPPER case
        switch(SWITCH_VARIABLE_LOWER){ // it will print out "Not found" because they are different
            case "A": case "B": case "C": case "D": case "E": case"I":
                // Display a message if any of these are found and then break
                System.out.println("Value is equal either A, B, C, D, or E");
                break;
            default:
                // Add a default which displays a message saying not found
                System.out.println("Not found!");
                break;
        }
        switch(SWITCH_VARIABLE_LOWER.toUpperCase()){ // it will print out "Not found" because they are different
            case "A": case "B": case "C": case "D": case "E": case"I":
                // Display a message if any of these are found and then break
                System.out.println("Value is equal either A, B, C, D, E, or I");
                break;
            default:
                // Add a default which displays a message saying not found
                System.out.println("Not found!");
                break;
        }
    }
}
