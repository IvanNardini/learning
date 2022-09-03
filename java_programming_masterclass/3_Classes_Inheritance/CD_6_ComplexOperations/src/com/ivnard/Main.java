package com.ivnard;

public class Main {

    public static void main(String[] args) {
//        TEST EXAMPLE
        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1,1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());
    }

//      OUTPUT
//
//        one.real= 2.0
//        one.imaginary= 2.0
//        one.real= -0.5
//        one.imaginary= 3.5
//        number.real= 3.0
//        number.imaginary= -5.0


}
