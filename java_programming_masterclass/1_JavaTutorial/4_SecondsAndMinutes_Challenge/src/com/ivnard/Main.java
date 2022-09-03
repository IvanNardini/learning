package com.ivnard;

public class Main {
    // final means once we assign the value we can't change it;
    private static final String INVALID_VALUE_MESSAGE = "Invalid method!";

    public static void main(String[] args) {
        System.out.println(getDurationString(10, 10));
        System.out.println(getDurationString(59, 10));
        System.out.println(getDurationString(600));
    }

    // Create a method called getDurationString
    // with first parameter minutes and 2nd parameter seconds
    public static String getDurationString(int minutes, int seconds){
        // You should validate that the first parameter minutes is >= 0.
        // You should validate that the 2nd parameter seconds is >= 0 and <= 59.
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)){
            // return Invalid value in the method if either of the above are not true.
            //return "Invalid method!"; // Let's comment this and use CONSTANT VARIABLE
            return INVALID_VALUE_MESSAGE;
        }
        // If the parameters are valid then calculate how many hours minutes and seconds
        // equal the minutes and seconds passed to this method
        // return that value as string in format XXh YYm ZZs
        // where XX represents a number of hours, YY the minutes and ZZ the seconds.
        // 1 minute = 60 seconds and 1 hour = 60 minutes or 3600 seconds.
        int HOURS = minutes / 60;
        int REMAIN_MINUTES = minutes % 60;
        // Add leading zeros
        String HOUR_STRING = HOURS + " h ";
        if (HOURS < 10){
            HOUR_STRING = "0" + HOUR_STRING;
        }
        String MINUTES_STRING =  REMAIN_MINUTES + " m ";
        if (REMAIN_MINUTES < 10){
            MINUTES_STRING = "0" + MINUTES_STRING;
        }

        String SECONDS_STRING =  seconds + " s ";
        if (seconds < 10){
            SECONDS_STRING = "0" + SECONDS_STRING;
        }

        return HOUR_STRING + MINUTES_STRING + SECONDS_STRING;
    }

    // Create a 2nd method of the same name but with only one parameter seconds.
    public static String getDurationString(int seconds){
        // Validate that it is >= 0, and return Invalid value if it is not true.
        if (seconds < 0){
            return INVALID_VALUE_MESSAGE;
        }
        // If it is valid, then calculate how many minutes are in the seconds value
        // and then call the other overloaded method passing the correct minutes and seconds
        // calculated so that it can calculate correctly.
        int MINUTES = seconds / 60;
        int REMAINED_SECONDS = seconds % 60;
        return getDurationString(MINUTES, REMAINED_SECONDS);
    }
}
