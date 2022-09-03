public class Main {

    public static void main(String[] args) {
        System.out.println(PaintJob.getBucketCount(3.4, 1.5)); //should return 3 since the area is 3.4 and a single bucket can cover an area of 1.5
        System.out.println(PaintJob.getBucketCount(6.26, 2.2)); //should return 3 since the wall area is 6.26 and a single bucket can cover an area of 2.2.
        System.out.println(PaintJob.getBucketCount(3.26, 0.75)); //should return 5 since the wall area is 3.26, and a single bucket can cover an area of 0.75 .

        System.out.println(PaintJob.getBucketCount(-3.4, 2.1, 1.5)); //should return -1
        System.out.println(PaintJob.getBucketCount(3.4, 2.1, 1.5)); //should return 5
        System.out.println(PaintJob.getBucketCount(7.25, 4.3, 2.35)); //should return 14

        System.out.println(PaintJob.getBucketCount(2.75, 3.25, 2.5, 1)); //should return 3 since the wall area is 8.9375, a single bucket can cover an area of 2.5 and Bob has 1 extra bucket at home.
        System.out.println(PaintJob.getBucketCount(3.4, 2.1, 1.5, 2)); // should return 3 since the wall area is 7.14, a single bucket can cover an area of 1.5 and Bob has 2 extra buckets home.
        System.out.println(PaintJob.getBucketCount(-3.4, 2.1, 1.5, 2)); //should return -1 since the width parameter is invalid


    }
}
