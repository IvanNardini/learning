public class ATMInter {
    public static int totalMoney = 0;
    public static int numATMs = 0;

    public int money;

    public ATMInter(int money) {
        this.money = money;
        numATMs += 1;
        totalMoney += money;
    }
    public void withdrawMoney(int amountToWithdraw){
        if(amountToWithdraw <= this.money){
            this.money -= amountToWithdraw;
            totalMoney -= amountToWithdraw;
        }
    }
    
    public static void main(String[] args){
        System.out.println("Total number of ATMs: " + ATMInter.numATMs);
        ATMInter firstATMInter = new ATMInter(1000);
        ATMInter secondATMInter = new ATMInter(500);
        System.out.println("Total number of ATMs: " + ATMInter.numATMs);

        System.out.println("Total amount of money in all ATMs: " + ATMInter.totalMoney);
        firstATMInter.withdrawMoney(500);
        secondATMInter.withdrawMoney(200);
        System.out.println("Total amount of money in all ATMs: " + ATMInter.totalMoney);
    }
}
