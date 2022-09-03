public class FirstLastDigitSum {

//    Write a method named sumFirstAndLastDigit with one parameter of type int called number.
//    The method needs to find the first and the last digit of the parameter number passed to
//    the method, using a loop and return the sum of the first and the last digit of that number.
//    If the number is negative then the method needs to return -1 to indicate an invalid value.

    public static int sumFirstAndLastDigit(int number) {

        if (number < 0){
            return -1;
        }

        int FIRST = 0, LAST = 0;

        LAST = number % 10;
        while (number > 0) {
            FIRST = number % 10;
            number /= 10;
        }

        return FIRST + LAST;
    }
}
