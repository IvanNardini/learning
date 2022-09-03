package com.ivnard.super_this_call;

// this() and super() are calls and they are a kind of methods

public class Rectangle {
    private int x;
    private int y;
    private int width;
    private int height;

    // This is a really bad example of constructors because duplication
    /*public Rectangle() {
        this.x = 0;
        this.y = 0;
        this.width = 0;
        this.height = 0;
    }

    public Rectangle(int width, int height) {
        this.x = 0;
        this.y = 0;
        this.width = width;
        this.height = height;
    }

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }*/

    //This is the case to call this(). And an example of constructor chaining
    //where the last constructor is responsable for initializing variables

    //1st constructor
    public Rectangle() {
        this(0,0); //calls 2nd constructor
    }

    //2nd constructor
    public Rectangle(int width, int height) {
        this (0, 0, width, height); //calls 3rd constructor
    }

    //3th constructor
    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    //Some notes:
    //this() calls 2th constructor from 3th overloading constructor
    //only in constructors
    //for constructor chaining. Reduce ducplicated code
    //one for constructor
}
