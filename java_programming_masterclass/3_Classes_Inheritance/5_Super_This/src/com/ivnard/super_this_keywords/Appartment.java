package com.ivnard.super_this_keywords;

public class Appartment extends House {
    public Appartment() {
        super("blue");
    }

    @Override
    public void test() {
        System.out.println("This is a test");
        // super is used in overriding method.
        // notice without super it would call itself until memory is full!
        super.test();
    }
}
