package com.ivnard;

public class Dog extends Animal {

    // Instance variables proper of a Dog
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    // Dog Constructor
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        //super means call the constructor of the class we are extending from
        //super(name, brain, body, size, weight); //we can do better than this.
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    //Of course we can override the eat method we inherit
    private void chew(){
        System.out.println("I chew food actually!");
    }

    @Override
    public void eat() {
        System.out.println("Does dog eat?");
        chew();
        super.eat(); //super stands for superior (top of)
    }

    //the same with move
    public void walk(){
        System.out.println("I can walk");
        move(5); //we could use super.move() but it's better move. If super he always look at Animal.
                       //Even if we define override that method below.
    }

    private void moveLegs(){
        System.out.println("I can shake my legs!");
    }

    // Although we override...
    @Override
    public void move(int speed) {
        System.out.println("Dog can move.");
        moveLegs();
        super.move(speed);
    }

    public void run(){
        System.out.println("I can run");
        move(10);
    }

    public int getEyes() {
        return eyes;
    }

    public int getLegs() {
        return legs;
    }

    public int getTail() {
        return tail;
    }

    public int getTeeth() {
        return teeth;
    }

    public String getCoat() {
        return coat;
    }
}
