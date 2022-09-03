package com.ivnard;

// Create a class and demonstate proper encapsulation techniques
// the class will be called Printer
// It will simulate a real Computer Printer
// It should have fields for the toner Level, number of pages printed, and
// also whether its a duplex printer (capable of printing on both sides of the paper).
// Add methods to fill up the toner (up to a maximum of 100%), another method to
// simulate printing a page (which should increase the number of pages printed).
// Decide on the scope, whether to use constructors, and anything else you think is needed.

public class Printer {

    // attributes
    private int tonerLevel;
    private int numberofprintedpages;
    private boolean isduplex;

    // constructor
    public Printer(int tonerLevel, boolean isduplex) {
        if (tonerLevel > -1 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.numberofprintedpages = 0;
        this.isduplex = isduplex;
    }

    public int addToner(int tonerAmount){
        if (tonerLevel >0 && tonerLevel <=100){
            if (this.tonerLevel + tonerAmount > 100){
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int printPage (int pages){
        int pagesToPrint = pages;
        if (isduplex){
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("Printing in duplex mode!");
        }
        this.numberofprintedpages += pagesToPrint;
        return pagesToPrint;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberofprintedpages() {
        return numberofprintedpages;
    }

    public boolean isIsduplex() {
        return isduplex;
    }
}
