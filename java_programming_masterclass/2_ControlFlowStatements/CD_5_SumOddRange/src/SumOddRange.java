public class SumOddRange {

    // Write a method called isOdd with an int parameter and call it number.
    // The method needs to return a boolean.
    public static boolean isOdd(int number) {
        // Check that number is > 0, if it is not return false.
        // If number is odd return true, otherwise  return false.
        if (number > 0) {
            return number % 2 != 0;
        } else {
            return false;
        }
    }

    // Write a second method called sumOdd that has 2 int parameters start and end,
    // which represent a range of numbers.
    public static int sumOdd(int start, int end) {

        // The parameter end needs to be greater than or equal to start
        // and both start and end parameters have to be greater than 0.
        // If those conditions are not satisfied return -1 from
        // the method to indicate invalid input.

        if ((start < 0) || (end < 0) || (end < start)) {
            return -1;
        }

        // The method should use a for loop to sum all odd numbers
        // in that range including the end and return the sum.

        int SUM = 0;
        for (int i = start; i <= end; i++) {
            //  It should call the method isOdd to check if each number is odd.
            if (isOdd(i)) {
                SUM += i;
            }
        }

        return SUM;
    }
}
