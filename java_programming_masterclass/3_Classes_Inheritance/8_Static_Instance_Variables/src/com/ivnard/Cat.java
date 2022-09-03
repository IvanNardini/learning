package com.ivnard;

public class Cat {

    //This is an example of instance variable
    //Does not use static keyword
    //belong to the instance of class
    //new instance, new value --> it represents a state

    private String name;

    // constructor
    public Cat(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("name = " + name);
    }
}
