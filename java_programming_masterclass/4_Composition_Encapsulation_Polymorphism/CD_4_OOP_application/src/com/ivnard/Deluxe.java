package com.ivnard;

// b) Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
// hint:  You have to find a way to automatically add these new additions at the time the deluxe burger
// object is created, and then prevent other additions being made.

public class Deluxe extends Base {
    public Deluxe() {
        super("Deluxe", "double burger", "red", 10);
        super.AddOneHamburger("chips", 5);
        super.AddTwoHamburger("drink", 2);
    }

    @Override
    public void AddOneHamburger(String name, double price) {
        System.out.println("Cannot add additional items!");
    }

    @Override
    public void AddTwoHamburger(String name, double price) {
        System.out.println("Cannot add additional items!");
    }

    @Override
    public void AddThreeHamburger(String name, double price) {
        System.out.println("Cannot add additional items!");
    }

    @Override
    public void AddFourHamburger(String name, double price) {
        System.out.println("Cannot add additional items!");
    }
}
