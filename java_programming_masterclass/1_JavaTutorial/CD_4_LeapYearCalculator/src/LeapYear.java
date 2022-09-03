public class LeapYear {

    //Write a method isLeapYear with a parameter of type int named year.
    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            // Step 1 : If the year is evenly divisible by 4
            if (year % 4 == 0) {
                // Step 2: If the year is evenly divisible by 100
                if (year % 100 == 0) {
                    // Step 3: If the year is evenly divisible by 400
                    if (year % 400 == 0) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}