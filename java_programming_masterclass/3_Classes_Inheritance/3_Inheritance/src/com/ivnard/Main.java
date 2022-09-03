package com.ivnard;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1,1, 5, 5);
        Dog dog = new Dog("Ed", 8, 20, 2, 4, 1, 20, "short white");
        //notice we can call eat because it's public inheritance from Animal
        dog.eat();
        dog.walk();
        dog.run();
    }
}
