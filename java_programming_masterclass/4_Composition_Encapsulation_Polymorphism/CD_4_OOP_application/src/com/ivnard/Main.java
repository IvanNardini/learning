package com.ivnard;

// The purpose of the application is to help a fictitious company called Bills Burgers to manage
// their process of selling hamburgers.
// Our application will help Bill to select types of burgers, some of the additional items (additions) to
// be added to the burgers and pricing.
// We want to create a base hamburger, but also two other types of hamburgers that are popular ones in Bills store.

//  All 3 classes should have a method that can be called anytime to show the base price of the hamburger
// plus all additionals, each showing the addition name, and addition price, and a grand/final total for the
// burger (base price + all additions)
// For the two additional classes this may require you to be looking at the base class for pricing and then
// adding totals to final price.

public class Main {

    public static void main(String[] args) {

        //Base Hamburger
        Base baseBurger = new Base("ivnard", "arabic", "turkey", 2);
        baseBurger.TotalPrice();
        baseBurger.AddOneHamburger("tomato", 1);
        baseBurger.TotalPrice();

        //Healthy Hamburger
        Healthy healthyBurger = new Healthy("turkey", 5);
        healthyBurger.AddFiveHamburger("vegan cheese", 5);
        healthyBurger.TotalPrice();

        //Deluxe Hamburger
        Deluxe deluxeburger = new Deluxe();
        deluxeburger.TotalPrice();
        deluxeburger.AddOneHamburger("tomato", 1);
    }
}
