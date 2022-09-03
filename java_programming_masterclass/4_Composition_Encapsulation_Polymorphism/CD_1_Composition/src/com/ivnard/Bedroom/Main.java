package com.ivnard.Bedroom;

// Create a single room of a house using composition.
// Think about the things that should be included in the room.
// Maybe physical parts of the house but furniture as well
// Add at least one method to access an object via a getter and
// then that objects public method as you saw in the previous video
// then add at least one method to hide the object e.g. not using a getter
// but to access the object used in composition within the main class
// like you saw in this video.

import com.ivnard.Kitchen.Chairs;
import com.ivnard.Kitchen.Hob;
import com.ivnard.Kitchen.Kitchen;
import com.ivnard.Kitchen.Table;

public class Main {
    Wall wall1 = new Wall("West");
    Wall wall2 = new Wall("Est");
    Wall wall3 = new Wall("North");
    Wall wall4 = new Wall("South");
    Ceiling ceiling = new Ceiling(2, 1);
    Bed bed = new Bed("hippy", 4, 50, 2, 1);
    Lamp lamp = new Lamp("old", false, 10);
    Bedroom bedRoom = new Bedroom("Bedroom", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
    //bedRoom.makeBed();
}
