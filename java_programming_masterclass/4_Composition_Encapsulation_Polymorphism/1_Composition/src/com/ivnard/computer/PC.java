package com.ivnard.computer;

public class PC { //Notice we use private and not extends because you can extends one class at time

    private Case theCase;
    private Monitor theMonitor;
    private Motherboard theMotherboard;

    public PC(Case theCase, Monitor theMonitor, Motherboard theMotherboard) {
        this.theCase = theCase;
        this.theMonitor = theMonitor;
        this.theMotherboard = theMotherboard;
    }

    public void powerUp() {
        theCase.pressPowerButtom();
        drawLogo();
    }

    private void drawLogo(){
        theMonitor.drawPixelAt(1200, 50, "red");
    }


//    public Case getTheCase() {
//        return theCase;
//    }
//
//    public void setTheCase(Case theCase) {
//        this.theCase = theCase;
//    }
//
//    public Monitor getTheMonitor() {
//        return theMonitor;
//    }
//
//    public void setTheMonitor(Monitor theMonitor) {
//        this.theMonitor = theMonitor;
//    }
//
//    public Motherboard getTheMotherboard() {
//        return theMotherboard;
//    }
//
//    public void setTheMotherboard(Motherboard theMotherboard) {
//        this.theMotherboard = theMotherboard;
//    }
}
