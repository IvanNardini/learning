public class Main {

    public static void main(String[] args) {

        boolean EONE = LeapYear.isLeapYear(-1600);// should return false since the parameter is not in range (1-9999)
        boolean ETWO = LeapYear.isLeapYear(1600);// should return true since 1600 is a leap year
        boolean ETHREE = LeapYear.isLeapYear(2017);// should return false since 2017 is not a leap year
        boolean EFOUR = LeapYear.isLeapYear(2000);// should return true because 2000 is a leap year
        boolean EXCEPTION = LeapYear.isLeapYear(1924); // should return true

        System.out.println(EONE);
        System.out.println(ETWO);
        System.out.println(ETHREE);
        System.out.println(EFOUR);
        System.out.println(EXCEPTION);
    }
}
