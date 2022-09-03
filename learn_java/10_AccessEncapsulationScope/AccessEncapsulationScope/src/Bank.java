public class Bank {
    private CheckingAccount accountOne;
    private CheckingAccount accountTwo;

    public Bank(){
        accountOne = new CheckingAccount("Ivan", 2000, "8");
        accountTwo = new CheckingAccount("Nobody", 0, "0");
    }

    public static void main(String[] args){
        Bank bankOfGods = new Bank();
        bankOfGods.accountOne.setBalance(5000);
//        System.out.println(bankOfGods.accountOne.name);
//        bankOfGods.accountOne.addFunds(5);
//        bankOfGods.accountOne.getInfo();
        System.out.println(bankOfGods.accountOne.getBalance());
        System.out.println(bankOfGods.accountTwo.getBalance());
//        bankOfGods.accountOne.calculateNextMonthInterest();
    }
}
