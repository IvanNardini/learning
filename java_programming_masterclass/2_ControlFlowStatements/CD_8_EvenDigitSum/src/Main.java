public class Main {
    public static void main(String[] args) {
        System.out.println(EvenDigitSum.getEvenDigitSum(22222));
        System.out.println(EvenDigitSum.getEvenDigitSum(123456789)); // should return 20 since 2 + 4 + 6 + 8 = 20
        System.out.println(EvenDigitSum.getEvenDigitSum(252)); // should return 4 since 2 + 2 = 4
        System.out.println(EvenDigitSum.getEvenDigitSum(-22)); // should return -1 since the number is negative
    }
}
