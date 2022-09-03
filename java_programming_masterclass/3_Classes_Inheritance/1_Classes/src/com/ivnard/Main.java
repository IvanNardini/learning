package com.ivnard;

public class Main {

    public static void main(String[] args) {
        // create an object based on the Car template
        // Remember name and initialize it.
        Car porsche = new Car();
        Car fiat = new Car();

       //porsche.model = "Carrera"; not the best method;
        System.out.println(porsche.getModel());
        porsche.setModel("Carrera");
        System.out.println(porsche.getModel());
    }
}
