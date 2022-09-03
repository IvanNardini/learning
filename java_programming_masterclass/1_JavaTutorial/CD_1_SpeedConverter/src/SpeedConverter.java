public class SpeedConverter {

    //Write a method toMilesPerHour with param kilometersPerHour double
    //return rounded long
    // if param is < 0, return  -1
    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour < 0) {
            return -1;
        }

        double MILESPERHOUR = kilometersPerHour / 1.609;
        return Math.round(MILESPERHOUR);
    }

    //method called printConversion with param kilometersPerHour double
    //it needs to calculate milesPerHour from the kilometersPerHour parameter
    //print a message in the format "XX km/h = YY mi/h"
    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        }else {
            long MILESPERHOUR = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " +
                    MILESPERHOUR + " mi/h");
        }
    }
}
