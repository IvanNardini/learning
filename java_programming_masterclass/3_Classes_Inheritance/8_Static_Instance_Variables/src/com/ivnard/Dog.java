package com.ivnard;

public class Dog {

    // This is an example of static variable
    // declared with static keyword
    // every instance shares same static variable
    // not so useful but sometimes...think about Scanner.

    private static String name;

    public Dog(String name){
        Dog.name = name;
    }

    public void printName(){
        System.out.println("name = " + name);
    }
}
