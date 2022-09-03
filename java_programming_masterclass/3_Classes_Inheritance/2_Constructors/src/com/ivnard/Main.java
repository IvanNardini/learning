package com.ivnard;

public class Main {

    public static void main(String[] args) {
//        BankAccount account1 =  new BankAccount("0000000",
//                                                100000,
//                                                "Ivan Nardini",
//                                                "ivan.nardini92@gmail.com",
//                                                "+39 3282255111"); // actually this is a constructor --> look at Account() in BankAccount()
//
//        // set account info --> that's not the best way for the 1st setting.
//        // we need to introduce constructor.
////        account.setAccountNumber("000000");
////        account.setBalance(10000);
////        account.setCustomerName("Ivan Nardini");
////        account.setEmail("ivan.nardini92@gmail.com");
////        account.setPhoneNumber("+39 3282255111");
//
//        //get
//        System.out.println(account1.getAccountNumber());
//        System.out.println(account1.getCustomerName());
//
//        // Operations
//        account1.withdrawFunds(100);
//        account1.depositFunds(50);
//        account1.withdrawFunds(100);
//        account1.depositFunds(1000);
//        account1.withdrawFunds(100);
//
//        // New account
//         BankAccount account2 = new BankAccount("Diego Nardini", "diego.nardini@gmail.com", "+39 333 1111111");
//        //get
//        System.out.println(account2.getAccountNumber());
//        System.out.println(account2.getBalance());

        //New Vip Account
        VIPCustomer vipAccount = new VIPCustomer();

        //Only default
        System.out.println(vipAccount.getName());
        System.out.println(vipAccount.getCreditLimit());
        System.out.println(vipAccount.getEmailAddress());

        //New Vip Account 2
        VIPCustomer vipAccount2 = new VIPCustomer("Ivan Nardini", 20000000);
        System.out.println(vipAccount2.getName());

        //New Vip Account 3
        VIPCustomer vipAccount3 = new VIPCustomer("Mariella Buonanno", 200000000, "mariella@gmail.com");
        System.out.println(vipAccount3.getName());

    }
}
