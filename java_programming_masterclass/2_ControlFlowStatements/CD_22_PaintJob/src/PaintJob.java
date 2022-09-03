public class PaintJob {

//    Write a method named getBucketCount with 4 parameters.
//    The first parameter should be named width of type double.
//    This parameter represents the width of the wall.
//    The second parameter should be named height of type double.
//    This parameter represents the height of the wall.
//    The third parameter should be named areaPerBucket.
//    This parameter represents the area that can be covered with one bucket of paint.
//    The fourth parameter should be named extraBuckets.
//    This parameter represents the bucket count that Bob has at home.
//    The method needs to return a value of type int that represents the number of buckets
//    that Bob needs to buy before going to work. To calculate the bucket count,
//    refer to the notes below.
//    If one of the parameters width, height or areaPerBucket is less or equal to 0 or
//    if extraBuckets is less than 0, the method needs to return -1 to indicate an invalid value.
//    If all parameters are valid, the method needs to calculate the number of buckets and return it

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        // Check condition
        if ((width <= 0) || (height <= 0) || (areaPerBucket <= 0) || (extraBuckets < 0)) {
            return -1;
        }
        // calculate the number of buckets and return it
        double area = width * height;
        double NBuckets = Math.ceil((area / areaPerBucket) -  extraBuckets);
        return (int) (NBuckets);
    }

//    Bob does not like to enter 0 for the extraBuckets parameter so he needs another method.
//    Write another overloaded method named getBucketCount with 3 parameters
//    namely width, height, and areaPerBucket (all of type double).
//    This method needs to return a value of type int that represents the number of buckets
//    that Bob needs to buy before going to work. To calculate the bucket count,
//    refer to the notes below.
//    If one of the parameters width, height or areaPerBucket is less or equal to 0,
//    the method needs to return -1 to indicate an invalid value.
//    If all parameters are valid, the method needs to calculate
//    the number of buckets and return it.

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        // Check condition
        if ((width <= 0) || (height <= 0) || (areaPerBucket <= 0)) {
            return -1;
        }

        // calculate the number of buckets and return it.
        double area = width * height;
        double NBuckets = Math.ceil(area / areaPerBucket);
        return (int) NBuckets;
    }

//    In some cases, Bob does not know the width and height
//    of the wall but he knows the area of a wall.
//    He needs you to write another method.
//    Write another overloaded method named getBucketCount
//    with 2 parameters namely, area and areaPerBucket (both of type double).
//    The method needs to return a value of type int that represents the number
//    of buckets that Bob needs to buy before going to work.
//    To calculate the bucket count, refer to the notes below.
//    If one of the parameters area or areaPerBucket is less or equal to 0,
//    the method needs to return -1 to indicate an invalid value.
//    If all parameters are valid, the method needs to calculate the number of buckets and return it.

    public static int getBucketCount(double area, double areaPerBucket) {
        // Check condition
        if ((area <= 0) || (areaPerBucket <= 0)) {
            return -1;
        }

        // calculate the number of buckets and return it
        // Use Math.ceil to round the number of calculated buckets (double)
        // then convert it into an int before returning the value from the methods.

        double NBuckets = Math.ceil(area / areaPerBucket);
        return (int) NBuckets;
    }
}
