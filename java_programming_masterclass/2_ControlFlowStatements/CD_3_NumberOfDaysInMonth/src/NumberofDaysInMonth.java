public class NumberofDaysInMonth {


//    Write a method isLeapYear with a parameter of type int named year.
//    The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
//    If the parameter is not in that range return false.
//    Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is, otherwise return false.

    public static boolean isLeapYear(int year){
        if (!((year >= 1) && (year <= 9999))){
            return false;
        } else {
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
        }
    }

//    Write another method getDaysInMonth with two parameters month and year. Both of type int.
//    If parameter month is < 1 or > 12 return -1.
//    If parameter year is < 1 or > 9999 then return -1.
//    This method needs to return the number of days in the month. Be careful about leap years they have 29 days in month 2 (February).
//    You should check if the year is a leap year using the method isLeapYear described above.

    public static int getDaysInMonth(int month, int year){
        // Condition 1: real month, year values
        if ((month <1 || month >12) || (year< 1 || year > 9999)) {
            return -1;
        } else {
            switch (month) {

                // months with 31 days
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    return 31;

                // February
                case 2:
                    if (isLeapYear(year)){
                        return 29;
                    } else {
                        return 28;
                    }

                // months with 30 days
                case 4: case 6: case 9: case 11:
                    return 30;
                default:
                    return -1;
            }
        }
    }
}
