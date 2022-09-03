package com.ivnard;

import java.util.function.DoubleFunction;

public class Main {

    public static void main(String[] args) {
        // how static variables work
        Dog rex = new Dog("rex");
        Dog fluffy = new Dog("fluffy");
        rex.printName();
        fluffy.printName(); // we get both fluffy because static are at object level
                            // they are shared b/w instances.
                            // Change in one instance, Change in all instances

        //how instance variables work
        Cat cat1 = new Cat("cat1");
        Cat cat2 = new Cat("cat2");
        cat1.printName();
        cat2.printName();
        
    }
}
