package com.company;

public class Main {

    public static void main(String[] args) {

        // a common problem is == vs = in conditional logic
        int NEWVALUE = 50;
        /*
        if (NEWVALUE = 50){ // error
            System.out.println('error');
        }
        */
        if (NEWVALUE == 50){ // error
            System.out.println("True");
        }

        // another error is this
        /*
        boolean isCar = false;
        if (isCar = true){ //no error because it assigns isCar true
            System.out.println("This is strange");
        }
        */

        boolean isCar = false;
        if (isCar == true){
            System.out.println("This is strange");
        }

        //different ways to get the same
        if (isCar){ // equal true
            System.out.println("One");
        }

        if (isCar != true){ //print
            System.out.println("Two");
        }

        if (isCar != false){ //no print
            System.out.println("Three");
        }
        // NOT operator or complementary operator
        if (!isCar){ //different to true --> print
            System.out.println("Four");
        }

        /*
        Use Abbreviation for avoid mistake with assignment
        and make the code clear
         */
    }
}
