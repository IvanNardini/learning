package com.ivnard;


// The basic hamburger should have the following items.
// Bread roll type, meat and up to 4 additional additions (things like lettuce, tomato, carrot, etc) that
// the customer can select to be added to the burger.
// Each one of these items gets charged an additional price so you need some way to track how many items got added
// and to calculate the final price (base burger with all the additions).
// This burger has a base price and the additions are all separately priced (up to 4 additions, see above).
// Create a Hamburger class to deal with all the above.
// The constructor should only include the roll type, meat and price, can also include name of burger or you
// can use a setter.


public class Base {

    private String name;
    private String breadRollType;
    private String meat;
    private double price;

    private String AddOneName;
    private double AddOnePrice;
    private String AddTwoName;
    private double AddTwoPrice;
    private String AddThreeName;
    private double AddThreePrice;
    private String AddFourName;
    private double AddFourPrice;

    public Base(String name, String breadRollType, String meat, double price) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
    }

    public void AddOneHamburger(String name, double price){
        this.AddOneName = name;
        this.AddOnePrice = price;
    }

    public void AddTwoHamburger(String name, double price){
        this.AddTwoName = name;
        this.AddTwoPrice = price;
    }
    public void AddThreeHamburger(String name, double price){
        this.AddThreeName = name;
        this.AddThreePrice = price;
    }
    public void AddFourHamburger(String name, double price){
        this.AddFourName = name;
        this.AddFourPrice = price;
    }

    public double TotalPrice(){

        System.out.println("You pick the Base Hamburger at $" + this.price);

        double HamburgerPriceTotal = this.price;

        if (AddOneName != null){
            HamburgerPriceTotal += this.AddOnePrice;
            System.out.println("You add " + this.AddOneName + " to the Base Hamburger at $"
                                + this.AddOnePrice + ". Total is now $" + HamburgerPriceTotal);
        }
        if (AddTwoName != null){
            HamburgerPriceTotal += this.AddTwoPrice;
            System.out.println("You add " + this.AddTwoName + " to the Base Hamburger at $"
                    + this.AddTwoPrice + ". Total is now $" + HamburgerPriceTotal);
        }
        if (AddThreeName != null){
            HamburgerPriceTotal += this.AddThreePrice;
            System.out.println("You add " + this.AddThreeName + " to the Base Hamburger at $"
                    + this.AddThreePrice + ". Total is now $" + HamburgerPriceTotal);
        }
        if (AddFourName != null){
            HamburgerPriceTotal += this.AddFourPrice;
            System.out.println("You add " + this.AddFourName + " to the Base Hamburger at $"
                    + this.AddFourPrice + ".");
        }

        return HamburgerPriceTotal;
    }
}
