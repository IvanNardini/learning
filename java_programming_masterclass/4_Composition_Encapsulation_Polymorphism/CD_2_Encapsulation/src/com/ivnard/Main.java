package com.ivnard;



public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        System.out.println("Initial page count = " + printer.getNumberofprintedpages());
        int pagesPrinted = printer.printPage(4);
        System.out.println("Current page count = " + printer.getNumberofprintedpages());
        pagesPrinted = printer.printPage(7);
        System.out.println("Current page count = " + printer.getNumberofprintedpages());
    }
}
