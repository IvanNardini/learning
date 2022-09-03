

public class Main {
    public static void main(String[] args) {
        System.out.println(NumberofDaysInMonth.isLeapYear(-1600));//should return false since the parameter is not in the range (1-9999)
        System.out.println(NumberofDaysInMonth.isLeapYear(1600));//should return true since 1600 is a leap year
        System.out.println(NumberofDaysInMonth.isLeapYear(2017));//should return false since 2017 is not a leap year
        System.out.println(NumberofDaysInMonth.isLeapYear(2000));//should return true because 2000 is a leap year

        System.out.println(NumberofDaysInMonth.getDaysInMonth(1, 2020));//should return 31 since January has 31 days.
        System.out.println(NumberofDaysInMonth.getDaysInMonth(2, 2020));//should return 29 since February has 29 days in a leap year and 2020 is a leap year.
        System.out.println(NumberofDaysInMonth.getDaysInMonth(2, 2018));//should return 28 since February has 28 days if it's not a leap year and 2018 is not a leap year.
        System.out.println(NumberofDaysInMonth.getDaysInMonth(-1, 2020));//should return -1 since the parameter month is invalid
        System.out.println(NumberofDaysInMonth.getDaysInMonth(1, -2020));//should return -1 since the parameter year is outside the range of 1 to 9999.

    }
}
