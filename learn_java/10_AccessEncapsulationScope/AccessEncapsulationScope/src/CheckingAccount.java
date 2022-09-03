public class CheckingAccount {
    private String name;
    private int balance;
    private String id;
    private double interestRate;

    public CheckingAccount(String inputName, int inputBalance, String inputId){
        this.name = inputName;
        this.balance = inputBalance;
        this.id = inputId;
        this.interestRate = 0.02;
    }

//    private void getInfo(){
//        System.out.println("This checking account belongs to " + name +". It has " + balance + " dollars in it.");
//    }

    private double calculateNextMonthInterest(){
        return this.balance * this.interestRate;
    }

    public void getAccountInformation(){
        System.out.println("Money in account: " + this.getBalance());
        System.out.println("Next Month's Interest: " + this.calculateNextMonthInterest());

    }

    private void addFunds(int fundsToAdd){
        balance += fundsToAdd;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int newBalance) {
        this.balance = newBalance;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public static void main(String[] args){
        CheckingAccount ivanAccount = new CheckingAccount("Ivan", 2000, "ivnard");
        System.out.println(ivanAccount.name);
        System.out.println(ivanAccount.balance);
        ivanAccount.addFunds(1000);
        System.out.println(ivanAccount.balance);

    }
}
