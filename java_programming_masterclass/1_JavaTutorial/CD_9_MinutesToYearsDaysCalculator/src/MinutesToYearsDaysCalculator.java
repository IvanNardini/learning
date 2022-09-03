public class MinutesToYearsDaysCalculator {

    private static final String INVALID_MESSAGE = "Invalid Value";

    // Write a method printYearsAndDays with parameter of type long named minutes
    // The method should not return anything (void)
    // calculate the years and days from the minutes parameter.

    public static void printYearsAndDays(long minutes){
        //If the parameter is less than 0, print text "Invalid Value".
        if (minutes < 0){
            System.out.println(INVALID_MESSAGE);
        }else {
            //if the parameter is valid then it needs to print a message
            // in the format "XX min = YY y and ZZ d".
            long days = (minutes / 60) / 24;
            long years = days / 365;
            long days_reminder = days % 365;
            System.out.println( minutes + " min = " +
                    years + " y and " +
                    days_reminder + " d ");
        }
    }
}
