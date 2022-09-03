public class Main {

    public static void main(String[] args) {
        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(25, 15));  //should return 5 since both can be divided by 5 without a remainder
        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(12, 30));  //should return 6 since both can be divided by 6 without a remainder
        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(9, 18));   //should return -1 since the first parameter is < 10
        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(81, 153)); //should return 9 since both can be divided by 9 without a remainder
    }
}
