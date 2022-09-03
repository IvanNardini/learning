package com.ivnard;

// Also create two extra varieties of Hamburgers (subclasses) to cater for

// a) Healthy burger (on a brown rye bread roll), plus two addition items that can be added.
// The healthy burger can have 6 items (Additions) in total.
// hint:  you probably want to process the two additional items in this new class (subclass of Hamburger),
// not the base class (Hamburger), since the two additions are only appropriate for this new class
// (in other words new burger type).

public class Healthy extends Base{
    public Healthy(String meat, double price) {
        super("Healthy","brown rye", meat, price);
    }

    private String AddFiveName;
    private double AddFivePrice;
    private String AddSixName;
    private double AddSixPrice;


    public void AddFiveHamburger(String name, double price){
        this.AddFiveName = name;
        this.AddFivePrice = price;
    }

    public void AddSixHamburger(String name, double price) {
        this.AddSixName = name;
        this.AddSixPrice = price;
    }

    @Override
    public double TotalPrice() {
        double HealthyTotalPrice = super.TotalPrice();

        if (AddFiveName != null){
            HealthyTotalPrice += this.AddFivePrice;
            System.out.println("You add " + this.AddFiveName + " to the Base Hamburger at $"
                    + this.AddFivePrice + ". Total is now $" + HealthyTotalPrice);
        }

        if (AddSixName != null){
            HealthyTotalPrice += this.AddSixPrice;
            System.out.println("You add " + this.AddSixName + " to the Base Hamburger at $"
                    + this.AddSixPrice + ".");
        }

        return HealthyTotalPrice;
    }
}


