package com.ivnard.Kitchen;

// Create a single room of a house using composition.
// Think about the things that should be included in the room.
// Maybe physical parts of the house but furniture as well
// Add at least one method to access an object via a getter and
// then that objects public method as you saw in the previous video
// then add at least one method to hide the object e.g. not using a getter
// but to access the object used in composition within the main class
// like you saw in this video.

public class Main {

    public static void main(String[] args) {

        Hob hob = new Hob("Ikea", "cool", 4, true);
        Table table = new Table("Ikea", "square", "square", true);
        Chairs chairs = new Chairs("Ikea", "Ivanisky", false);
        Kitchen kitchen = new Kitchen(hob, table, chairs);
        kitchen.checkPowerHob();
        kitchen.getHob().upstove(3);
    }

    // Remember: There are two different types of composition:
    // a) Direct: call the class to compose in the composed class directly (without getter);
    // b) Indirect: call the class to compose with the getter. 
}
