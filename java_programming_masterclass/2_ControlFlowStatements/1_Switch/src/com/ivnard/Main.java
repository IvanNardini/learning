package com.ivnard;

public class Main {
    private static final int VALUE = 1;
    private static final int SWITCH_VALUE = 1;
    public static void main(String[] args) {

        // if statement
        if (VALUE == 1){
            System.out.println("Value is 1");
        } else if (VALUE == 2){
            System.out.println("Value is 2");
        } else if (VALUE == 3) {
            System.out.println("Value is 3");
        } else {
            System.out.println("Value is neither 1, 2 or 3!");
        }

        // Consideration: It might be tedious setting several if statements

        // Switch flow may be an alternative
        switch(SWITCH_VALUE){
            // Test different cases
            case 1: case 2: case 3: case 4: case 5:
                System.out.println("Value is between 1 and 5");
                System.out.println("Value is " + SWITCH_VALUE);
                break; // DONT FORGET break STATEMENT. Else it processes ALL cases!

            // Set the default one
            default:
                System.out.println("Value is not between 1 and 5");
                break;
        }
    }
}
