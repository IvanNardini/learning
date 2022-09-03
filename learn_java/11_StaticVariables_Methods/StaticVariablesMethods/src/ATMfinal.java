public class ATMfinal {
    // Static variables
    public static int totalMoney = 0;
    public static int numATMs = 0;

    // Instance variables
    public int money;

    public ATMfinal(int inputMoney){
        this.money = inputMoney;
        numATMs += 1;
        totalMoney += inputMoney;
    }

    public void withdrawMoney(int amountToWithdraw){
        if(amountToWithdraw <= this.money){
            this.money -= amountToWithdraw;
            totalMoney -= amountToWithdraw;
        }
    }

    // Write your averageMoney() method here
    public static void averageMoney(){
//        System.out.println(this.money); java: non-static variable this cannot be referenced from a static context
        System.out.println(totalMoney/numATMs);
    }

    public static void main(String[] args){

        System.out.println("Total number of ATMs: " + ATMfinal.numATMs);
        ATMfinal firstATM = new ATMfinal(1000);
        ATMfinal secondATM = new ATMfinal(500);
        System.out.println("Total number of ATMs: " + ATMfinal.numATMs);

        System.out.println("Total amount of money in all ATMs: " + ATMfinal.totalMoney);
        firstATM.withdrawMoney(500);
        secondATM.withdrawMoney(200);
        System.out.println("Total amount of money in all ATMs: " + ATMfinal.totalMoney);

        // Call averageMoney() here
        ATMfinal.averageMoney();
    }

}