public class DecimalComparator {

    // Write a method areEqualByThreeDecimalPlaces with two parameters of type double
    public static boolean areEqualByThreeDecimalPlaces(double x, double y){
        // Multiply to 1000 to get 3 decimals
        double x_NEW = x * 1000;
        double y_NEW = y * 1000;

        //return true if two double numbers are the same up to three decimal places
        // cast the int component
        return (int)x_NEW == (int)y_NEW;
    }

    public static void printValues(double x, double y){
        double x_NEW = x * 1000;
        double y_NEW = y * 1000;

        System.out.println(x_NEW);
        System.out.println(y_NEW);
        System.out.println((int) x_NEW);
        System.out.println((int) y_NEW);
    }
}