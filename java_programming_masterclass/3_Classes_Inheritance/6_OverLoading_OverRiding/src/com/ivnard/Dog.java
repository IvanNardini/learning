package com.ivnard;

// This is an example of overriding
class Dog {
    public void bark() {
        System.out.println("woof");
    }
}

// same name, same parameters
// where GermanSheperd extends Dog
class GermanSheperd extends Dog {
    @Override
    public void bark() {
        System.out.println("woof woof woof");
    }
}
