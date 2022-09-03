public class NumberPalindrome {

    //Write a method called isPalindrome with one int parameter called number.
    //The method needs to return a boolean.
    //It should return true if the number is a palindrome number
    // otherwise it should return false.

    public static boolean isPalidrome(int number){
        //  Find the the reverse of the given number.
        //  Store it in some variable say reverse.
        //  Compare the number with reverse.
        //  If both are the the same then the number is a palindrome otherwise it is not.
        int REVERSE = 0;
        int LASTDIGIT = 0;
        int ORIGIN = number;

        System.out.println("The number is " + number);

        while (Math.abs(number)>0) {

            // Extract the last digit of the given number by performing the modulo division (remainder).
            // Store the last digit to some variable say lastDigit = num % 10.
            LASTDIGIT = number % 10;
            System.out.println("Extract the last digit " + LASTDIGIT);
            // Increase the place value of reverse by one.
            // To increase place value multiply the reverse variable by 10 e.g. reverse = reverse * 10.
            REVERSE *= 10;
            System.out.println("Increase the place value of reverse by one " + REVERSE);
            // Add lastDigit to reverse.
            REVERSE += LASTDIGIT;
            System.out.println("Add lastDigit to reverse " + REVERSE);
            // Since the last digit of the number is processed, remove the last digit of num.
            // To remove the last digit divide number by 10.
            number /= 10;
            System.out.println("Remove the last digit of num " + REVERSE);
        }
        return ORIGIN == REVERSE;
    }
}
