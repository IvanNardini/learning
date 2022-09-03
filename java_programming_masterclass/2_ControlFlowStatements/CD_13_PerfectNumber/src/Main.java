public class Main {
    public static void main(String[] args) {
        System.out.println(PerfectNumber.isPerfectNumber(6));  // should return true since its proper divisors are 1, 2, 3 and the sum is 1 + 2 + 3 = 6
        System.out.println(PerfectNumber.isPerfectNumber(28)); // should return true since its proper divisors are 1, 2, 4, 7, 14 and the sum is 1 + 2 + 4 + 7 + 14 = 28
        System.out.println(PerfectNumber.isPerfectNumber(5));  // should return false since its only proper divisor is 1 and the sum is 1 not 5
        System.out.println(PerfectNumber.isPerfectNumber(-1)); // should return false since the number is < 1
    }
}

