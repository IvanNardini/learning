public class LargestPrime {

    //Write a method named getLargestPrime with one parameter of type int named number.
    //If the number is negative or does not have any prime numbers, the method should return -1 to indicate an invalid value.
    //The method should calculate the largest prime factor of a given number and return it.

    public static int getLargestPrime(int number) {

            int isPrime = 0;
            int LargePrime = -1;
            for (int i = 2; i <= number; i++) {
                if (number % i == 0) {
                    isPrime = 0;

                    for (int x = 2; x <= Math.sqrt(i); x++) {
                        if (i % x == 0) {
                            isPrime = 1;
                            break;
                        }
                    }
                    if (isPrime == 0) {
                        LargePrime = i;
                    }
                }
            }
            return LargePrime;
        }
    }


//    public static int getLargestPrime(int number){
//
//        if (number <= 1) {
//            return -1;
//        }
//
//        for (int i = number; i >= 2; i--) {
//
//            if (number % i == 0 && isPrime(i)) {
//                int primeFactor = i;
//                return primeFactor;
//            }
//        }
//
//        return -1;
//    }
//
//    public static boolean isPrime(int number) {
//        if (number == 2){
//            return true;
//        }
//
//        for (int i = 2; i < number; i++){
//            if(number % i == 0){
//                return false;
//            }
//        }
//        return true;
//    }
// }
