package com.ivnard.Kitchen;

public class Kitchen {

    // Attributes
    private Hob hob;
    private Table table;
    private Chairs chairs;

    public Kitchen(Hob hob, Table table, Chairs chairs) {
        this.hob = hob;
        this.table = table;
        this.chairs = chairs;
    }

    public void checkPowerHob(){
      hob.powerON();
    }

    public Hob getHob() {
        return hob;
    }

    public void setHob(Hob hob) {
        this.hob = hob;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public Chairs getChairs() {
        return chairs;
    }

    public void setChairs(Chairs chairs) {
        this.chairs = chairs;
    }
}
