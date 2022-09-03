package com.ivnard;

// Create a new class for a bank account
// Create fields for the account number, balance, customer name, email and phone number.
// Create getters and setters for each field
// Create two additional methods
// 1. To allow the customer to deposit funds (this should increment the balance field).
// 2. To allow the customer to withdraw funds. This should deduct from the balance field,
// but not allow the withdrawal to complete if their are insufficient funds.
// You will want to create various code in the Main class (the one created by IntelliJ) to
// confirm your code is working.
// Add some System.out.println's in the two methods above as well.

public class BankAccount {

    // Attributes

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    // Constructors

    // This is a constructor. When we call a new instance of class
    // It will call this method to fill the values.
    // It initializes the class
//    public BankAccount() {
//        //System.out.println("This is a constructor!");
//        //this MUST BE the first line!
//        this("000000",
//                0,
//                "Default",
//                "Default",
//                "Default");
//    }

    // We can overload constructor
    // It is useful for defining default values like above
    // The idea: if any parameters, use the default one.
    public BankAccount(String accountNumber,
                       double balance,
                       String customerName,
                       String email,
                       String phoneNumber){
        this.accountNumber = accountNumber; // of course we could use setter. But it's not the right approach with constructor.
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // This is an alternative and better way to set default paramenter
    public BankAccount(String customerName, String email, String phoneNumber) {
        this("000000", 100, customerName, email, phoneNumber);
    }

    // Methods
    public void depositFunds(double amount){
        this.balance += amount;
        System.out.println("Deposit of " + amount + " processed. Actual balance = " + this.balance);
    }

    public void withdrawFunds(double amount){
        if (this.balance - amount < 0){
            System.out.println("Insufficent amount of money!");
        } else {
            this.balance -= amount;
            System.out.println("Withdrawal of " + amount + " processed. Remaining balance = " + this.balance);
        }
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
