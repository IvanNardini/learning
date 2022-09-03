public class TeenNumberChecker {

    //Write a method named hasTeen with 3 parameters of type int.
    public static boolean hasTeen(int x, int y, int z) {
        //return true if one of the parameters is in range 13(inclusive) - 19 (inclusive).
        // Otherwise return false.
        return (x >= 13 && x <= 19) || (y >= 13 && y <= 19) || (z >= 13 && z <= 19);
    }

    //Write another method named isTeen with 1 parameter of type int.
    public static boolean isTeen(int x){
        //return true if the parameter is in range 13(inclusive) - 19 (inclusive).
        // Otherwise return false.
        return (x >= 13 && x <= 19);
    }
}
