public class Main {
    public static void main(String[] args) {
        boolean ONE = DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175); // should return true
        boolean TWO = DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176); // should return false
        boolean THREE = DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0); // should return true
        boolean FOUR = DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123); // should return false

        System.out.println(ONE);
        System.out.println(TWO);
        System.out.println(THREE);
        System.out.println(FOUR);

        //Just a check
        DecimalComparator.printValues(-3.1756, -3.17);
    }
}
