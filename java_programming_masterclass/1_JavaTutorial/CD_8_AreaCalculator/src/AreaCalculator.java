public class AreaCalculator {

    private static final double PI = 3.14159;

    // Write a method named area with one double parameter named radius
    // The method needs to return a double value that represents the area of a circle

    public static double area(double radius){
        // check for sign
        if (radius < 0){
            return -1.0;
        }
        return radius * radius * PI;
    }

    // Write another overloaded method with 2 parameters x and y (both doubles), where x and y represent the sides of a rectangle.
    // The method needs to return an area of a rectangle.

    public static double area(double x, double y){
        // check for sign
        if ((x < 0) || (y < 0)){
            return -1.0;
        }
        return x * y;
    }
}