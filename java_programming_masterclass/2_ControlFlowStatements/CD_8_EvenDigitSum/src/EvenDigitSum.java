public class EvenDigitSum {

//    Write a method named getEvenDigitSum with one parameter of type int called number.
//    The method should return the sum of the even digits within the number.
//    If the number is negative, the method should return -1 to indicate an invalid value.

    public static int getEvenDigitSum(int number){
        if (number < 0){
            return -1;
        }

        int SUM = 0, N = 0;

        while (number > 0) {
            // Extract a number
            N = number % 10;
            // Check if even. If yes add
            if ((N % 2) == 0) {
                SUM += N;
            }
            number /= 10;
        }
        return SUM;
    }
}
