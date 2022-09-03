package com.ivnard;

// This is a example of overloading
class Cat {
    public void meow(){
        System.out.println("meow");
    }
    //same name but different parameters
    public void meow(int number){
        for (int i = 0; i < number; i ++){
            System.out.println("meow");
        }
    }
}
