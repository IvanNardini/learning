public class Main {
    public static void main(String[] args) {
        // Test getDigitCount
//        System.out.println(NumberToWords.getDigitCount(0)); //should return 1 since there is only 1 digit
//        System.out.println(NumberToWords.getDigitCount(123)); //should return 3
//        System.out.println(NumberToWords.getDigitCount(-12)); //should return -1 since the parameter is negative
//        System.out.println(NumberToWords.getDigitCount(5200)); //should return 4 since there are 4 digits in the number

        // Test reverse
//        System.out.println(NumberToWords.reverse(-121)); //should  return -121
//        System.out.println(NumberToWords.reverse(1212)); //should return  2121
//        System.out.println(NumberToWords.reverse(1234)); //should return 4321
//        System.out.println(NumberToWords.reverse(100));  //should return 1

        // Test getDigitCount
        NumberToWords.numberToWords(123); //should print "One Two Three".
        NumberToWords.numberToWords(1010); //should print "One Zero One Zero".
        NumberToWords.numberToWords(1000); //should print "One Zero Zero Zero".
        NumberToWords.numberToWords(-12); //should print "Invalid Value" since the parameter is negative.
        NumberToWords.numberToWords(0);

    }
}
