public class Main {
    // Add some code to the main method to test out the
    // sumDigits method to determine that it is working
    // correctly for valid and invalid values passed as arguments.
    // For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
    // Calling the method sumDigits(1) should return -1 as per requirements described above.

    public static void main(String[] args) {
        System.out.println(DigitSumChallenge.sumDigits(125));
        System.out.println(DigitSumChallenge.sumDigits(1));
        System.out.println(DigitSumChallenge.sumDigits(-1));
    }

}
