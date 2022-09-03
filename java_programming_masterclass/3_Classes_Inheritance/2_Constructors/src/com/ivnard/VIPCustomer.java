package com.ivnard;

// Create a new class VipCustomer
// it should have 3 fields name, credit limit, and email address.
// create 3 constructors
// 1st constructor empty should call the constructor with 3 parameters with default values
// 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
// 3rd constructor should save all fields.
// create getters only for this using code generation of intellij as setters wont be needed
// test and confirm it works.

public class VIPCustomer {

    // Instance variables
    private String name;
    private double CreditLimit;
    private String emailAddress;

    //Constructors

    public VIPCustomer(){
        this("Default", 100, "Default");
    }

    public VIPCustomer(String name, double creditLimit){
        this(name, creditLimit,"Default");
    }

    public VIPCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.CreditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    // Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setCreditLimit(double creditLimit) {
        CreditLimit = creditLimit;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    //Getters

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return CreditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
