public class Main {
    public static void main(String[] args) {

        System.out.println(LastDigitChecker.hasSameLastDigit(41,22, 71)); //should return true since 1 is the rightmost digit in numbers 41 and 71
        System.out.println(LastDigitChecker.hasSameLastDigit(23, 32, 42)); // should return true since 2 is the rightmost digit in numbers 32 and 42
        System.out.println(LastDigitChecker.hasSameLastDigit(9, 99, 999)); // should return false since 9 is not within the range of 10-1000
    }
}