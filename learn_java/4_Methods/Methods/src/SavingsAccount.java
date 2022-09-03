public class SavingsAccount {

    //Instance fields
    int balance;

    //Constructor
    public SavingsAccount(int initialBalance){
        balance = initialBalance;
    }

    //Methods

    //checkBalance
    public void checkBalance(){
        System.out.println("Hello!");
        System.out.println("Your balance is " + balance);
    }

    //deposit
    public void deposit(int amountToDeposit){
        balance = balance + amountToDeposit;
        System.out.println("You just deposited " + amountToDeposit);
    }

    //withdraw
    public int withdraw(int amountToWithdraw){
        balance = balance - amountToWithdraw;
        System.out.println("You just withdrew " + amountToWithdraw);
        return amountToWithdraw;
    }

    //toString()
    public String toString() {
        return "SavingsAccount{" +
                "balance=" + balance +
                '}';
    }

    //Main
    public static void main(String[] args){
        SavingsAccount savings = new SavingsAccount(2000);

        //Check balance:
        //System.out.println("Hello!");
        //System.out.println("Your balance is "+savings.balance);
        savings.checkBalance();

        //Withdrawing:
        //int afterWithdraw = savings.balance - 300;
        //savings.balance = afterWithdraw;
        //System.out.println("You just withdrew "+300);
        savings.withdraw(300);

        //Check balance:
        //System.out.println("Hello!");
        //System.out.println("Your balance is "+savings.balance);
        savings.checkBalance();

        //Deposit:
        //int afterDeposit = savings.balance + 600;
        //savings.balance = afterDeposit;
        //System.out.println("You just deposited "+600);
        savings.deposit(600);

        //Check balance:
        //System.out.println("Hello!");
        //System.out.println("Your balance is "+savings.balance);
        savings.checkBalance();

        //Deposit:
        //int afterDeposit2 = savings.balance + 600;
        //savings.balance = afterDeposit2;
        //System.out.println("You just deposited "+600);
        savings.deposit(600);

        //Check balance:
        //System.out.println("Hello!");
        //System.out.println("Your balance is "+savings.balance);
        savings.checkBalance();

        //Print info about the savings
        System.out.println(savings);
    }
}

