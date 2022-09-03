public class DigitSumChallenge {

// Write a method with the name sumDigits that has one int parameter called number.
    public static int sumDigits(int number){
        // If parameter is >= 10 then the method should process the number
        // and return sum of all digits
        // otherwise return -1 to indicate an invalid value
        if ((number < 10)|| (number < 0)){
            return -1;
        }
        // 125--> 125:10=12 & 12*10=120 --> 125-120 = 5
        int SUM = 0;
        while(number > 0){
            // Use n % 10 to extract the least-significant digit.
            int DIGIT = number % 10;
            SUM += DIGIT;
            // Use n = n / 10 to discard the least-significant digit.
            number /= 10;
        }

        return SUM;
    }
//    The numbers from 0-9 have 1 digit so we don't want to process them
//    also we don't want to process negative numbers, so also return -1 for negative numbers.

}
