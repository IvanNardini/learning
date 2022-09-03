public class SharedDigit {

//    Write a method named hasSharedDigit with two parameters of type int.
//    Each number should be within the range of 10 (inclusive) - 99 (inclusive).
//    If one of the numbers is not within the range, the method should return false.
//    The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
//    otherwise, the method should return false.

    public static boolean hasSharedDigit(int x, int y){

        if (((x < 10) || (x > 99)) || ((y < 10) || (y > 99))){
            return false;
        }

        // variables
        int X_DIGIT = 0;
        int Y_DIGIT = 0;
        boolean HASHARED = false;

        while (x !=  0){
            X_DIGIT = x % 10;

            int TEMPY = y;
            while(TEMPY != 0){
                Y_DIGIT = TEMPY % 10;
                if (X_DIGIT == Y_DIGIT){
                    HASHARED = true;
                }
                TEMPY /= 10;
            }
            // Drop one value
            x /= 10;
        }
        return HASHARED;
    }
}
