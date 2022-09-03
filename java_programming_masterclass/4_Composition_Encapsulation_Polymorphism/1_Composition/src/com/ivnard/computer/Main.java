package com.ivnard.computer;

// Vehicle-Car is an example of IS RELATIONSHIP.
// In Java, you deal with INHERITANCE
// When you have a HAS RELATIONSHIP
// COMPOSITION comes into play
// Example of computer: Computer HAS MOUSE, HAS MONITOR, HAS KEYBOARD...

public class Main {

    public static void main(String[] args) {
        // Initialize
        Dimensions dimensions = new Dimensions(30, 30, 10);
        Resolution resolution = new Resolution(30, 30);
	    Case theCase = new Case("A7", "DELL", "240", dimensions);
	    Monitor theMonitor = new Monitor("B7", "Dell", 20, resolution);
	    Motherboard theMotherBoard = new Motherboard("C7", "Asus", 4, 6, "vX");

	    //The PC is a composition of...
	    PC thePC = new PC(theCase, theMonitor, theMotherBoard);
	    //how to access something we don't have override method
//        thePC.getTheMonitor().drawPixelAt(1500, 1200, "blue");
//        thePC.getTheMotherboard().loadProgram("Start");
//        thePC.getTheCase().pressPowerButtom();
        thePC.powerUp();
    }
}
