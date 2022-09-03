package com.ivnard;

public class Main {

    public static void main(String[] args) {
        // Test code
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());

        //Expected Output
        // add= 9.0
        // subtract= 1.0
        // multiply= 0.0
        // divide= 0.0
    }
}
