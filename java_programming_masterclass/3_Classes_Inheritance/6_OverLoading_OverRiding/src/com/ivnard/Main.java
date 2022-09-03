package com.ivnard;

public class Main {

    public static void main(String[] args) {
        System.out.println("Sum up");
        // Use Overloading when
        // 1) reuse method with different parameters
        // 2) usually in a sigle class but you can have child class
        // 3) must change parameters (may change return, modifiers and exceptions)

        //Use Overriding when
        // 1) override a method inherited from a parent class
        // 2) always in two parent-child classes
        // 3) same params, same names
        // 4) same return types and covariant return types (child types of a parent class)
        // 5) can change parent modifiers but not the lower one
    }
}
