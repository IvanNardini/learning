package com.ivnard.super_this_keywords;

// super to access/call parent class attributes or methods
// this  to access/call same class attributes or methods. Useful when we have a method
// with a parameter with the same name of the attribute.
// ! you can't use them if static block

public class House {
    // Instance variables
    private String color;

    public House(String color) {
        //here is required because color parameter same name of instance variables
        this.color = color; //this is used in constructors
    }

    public void test(){
    }

    public String getColor() {
        return color; //this can be used in getters
    }

    public void setColor(String color) {
        this.color = color; //this is used in setters
    }

}
