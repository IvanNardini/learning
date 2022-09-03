package com.ivnard;

public class EnhancedPlayer {
    private String name;
    private int LifePoints;
    private String weapon;

    public EnhancedPlayer(String name, int LifePoints, String weapon) {
        this.name = name;

        if (LifePoints >0 && LifePoints <= 200){
            LifePoints = 0;
        }
        this.LifePoints = LifePoints;
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        this.LifePoints = this.LifePoints - damage;
        if(this.LifePoints <=0){
            System.out.println("Player knoched out");
        }
    }

    public int getLifePoints() {
        return LifePoints;
    }
}
