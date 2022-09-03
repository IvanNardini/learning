package com.ivnard;

// Encapsulation allows to restrict access to components in the object created
// It's about security

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Tim"; // ISSUE #2: also if we're able to change attributes, we can break the program
//        player.health = 20; // ISSUE #3: because we type attributes one by one we may forget something
//        player.weapon = "Guns";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println(player.healthRemaining());
//
//        damage = 11;
//        // ISSUE #1: but because health is public we can trick the game
//        player.health = 12; //we save now
//        player.loseHealth(damage);
//        System.out.println(player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Ivan", 1000, "Guns");
        System.out.println(player.getLifePoints());
        player.loseHealth(90);
        System.out.println(player.getLifePoints()); // Notice thanks to incapsulation we would change variable name
                                                    // without change method name and still works!

    }
}
