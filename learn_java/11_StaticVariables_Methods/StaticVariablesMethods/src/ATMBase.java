public class ATMBase {

    // Static variables
    public static String logo = "ATMBase Express";
    public static String color = "red";
    public static int code = 0000;

    // Instance variables
    public int money;

    // Constructor
    public ATMBase(int money) {
        this.money = money;
    }

    public void withdrawMoney(int amountToWithdraw){
        if(amountToWithdraw <= this.money){
        }
    }

    public static void main(String[] args){
        ATMBase firstATMBase = new ATMBase(1000);
        ATMBase secondATMBase = new ATMBase(500);
        System.out.println(ATMBase.logo);
        System.out.println(firstATMBase.logo);
        System.out.println(secondATMBase.logo);
    }
}
