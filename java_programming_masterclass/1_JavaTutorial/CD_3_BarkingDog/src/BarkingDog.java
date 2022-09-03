public class BarkingDog {
    // a method shouldWakeUp that has 2 parameters:
    // 1st parameter should be of type boolean and be named barking it represents if our dog is currently barking.
    // 2nd parameter represents the hour of the day and is of type int with the name hourOfDay and has a valid range of 0-23.

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){

        //We have to wake up if the dog is barking before 8 or after 22 hours so in that case return true.
        //return (barking) && (hourOfDay > 8 && hourOfDay < 22);

        if ((hourOfDay < 0 | hourOfDay > 23)){
            return false;
        }

        if ((barking) && (hourOfDay < 8 || hourOfDay > 22)){
            return true;
        } else {
            return false;
        }
    }
}
