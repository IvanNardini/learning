public class PerfectNumber {

//    Write a method named isPerfectNumber with one parameter of type int named number.
//    If number is < 1, the method should return false.
//    The method must calculate if the number is perfect.
//    If the number is perfect, the method should return true; otherwise, it should return false.

    public static boolean isPerfectNumber(int number){
        if (number < 1){
            return false;
        }
        // A perfect number is a positive integer which is equal
        // to the sum of its proper positive divisors.
        int SUM = 0;
        for (int i=1; i<=number; i++){
            if (number % i == 0){
                SUM += i;
            }
            if (number == SUM){
                return true;
            }
        }
        return false;
    }
}
