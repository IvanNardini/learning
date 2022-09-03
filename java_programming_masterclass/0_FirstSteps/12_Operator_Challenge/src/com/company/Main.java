package com.company;

public class Main {

    public static void main(String[] args) {

        // Operator Challenge

        //Step1
        double VARONE = 20.00d;
        //Step 2
        double VARTWO = 80.00d;
        //Step3
        double SUM  = (VARONE + VARTWO) * 100d; // 1000.00
        //Step4
        double REM_SUM = (SUM % 40.00d); //25.00
        //Step5
        boolean CHECK_REMINDER = REM_SUM==0; //true. The same with Ternary (REM_SUM == 0)? true: false
        //Step6
        System.out.println(CHECK_REMINDER); //true
        //Step7
        if (!CHECK_REMINDER){
            System.out.println("Got some reminder"); //nothing to print
        }
    }
}
