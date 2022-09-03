public class LastDigitChecker {

    //Write a method named hasSameLastDigit with three parameters of type int.
    // Each number should be within the range of 10 (inclusive) - 1000 (inclusive). If one of the numbers is not within the range, the method should return false.
    // The method should return true if at least two of the numbers share the same rightmost digit; otherwise, it should return false.

    public static boolean hasSameLastDigit(int x, int y, int z) {
        //range condition
        if ((isValid(x)) && (isValid(y)) && (isValid(z))) {

            int RIGHT_DIGIT_X = x % 10;
            int RIGHT_DIGIT_Y = y % 10;
            int RIGHT_DIGIT_Z = z % 10;

            return (RIGHT_DIGIT_X == RIGHT_DIGIT_Y) || (RIGHT_DIGIT_X == RIGHT_DIGIT_Z) || (RIGHT_DIGIT_Y == RIGHT_DIGIT_Z);
        }
        return false;
    }

    public static boolean isValid(int var) {
        return var >= 10 && var <= 1000;
    }
}
