public class Main {
    public static void main(String[] args) {
        System.out.println(LargestPrime.getLargestPrime (21)); //should return 7 since 7 is the largest prime (3 * 7 = 21)
        System.out.println(LargestPrime.getLargestPrime (217)); //should return 31 since 31 is the largest prime (7 * 31 = 217)
        System.out.println(LargestPrime.getLargestPrime (0)); //should return -1 since 0 does not have any prime numbers
        System.out.println(LargestPrime.getLargestPrime (45)); //should return 5 since 5 is the largest prime (3 * 3 * 5 = 45)
        System.out.println(LargestPrime.getLargestPrime (-1)); //should return -1 since the parameter is negative
    }
}
