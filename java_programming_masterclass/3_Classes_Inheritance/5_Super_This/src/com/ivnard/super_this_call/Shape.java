package com.ivnard.super_this_call;

public class Shape {

    private int x;
    private int y;

    public Shape(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class Shape_Rectangle extends Shape {
    private int width;
    private int height;

    //1st constructor
    public Shape_Rectangle(int x, int y){
        this(x, y, 0, 0); //calls 2nd constructor
    }
    //2nd constructor
    public Shape_Rectangle(int x, int y, int width, int height) {
        super(x, y); //calls constructor from parent (Shape)
        this.width = width;
        this.height = height;
    }

    // Some notes:
    // 1) you can have a constructor either with  this() or super(). Not both.
    // 2) this() and super() call must be the 1st statement in a constructor


}
