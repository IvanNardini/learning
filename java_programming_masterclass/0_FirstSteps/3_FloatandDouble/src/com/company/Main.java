package com.company;

public class Main {

    public static void main(String[] args) {
        /*
        Floating Point Numbers are numbers with decimal points.
        Depends on precision(format and space occupied by number),
        we have float and double primitive types.
        float is a single precision type (32bits)
        double is a double precision type (64bits)
         */

        float minfloat = Float.MIN_VALUE;
        float maxfloat = Float.MAX_VALUE;

        double mindouble = Double.MIN_VALUE;
        double  maxdouble = Double.MAX_VALUE;

        System.out.println(minfloat);
        System.out.println(maxfloat);
        System.out.println(mindouble);
        System.out.println(maxdouble);

        //Compare primitives
        int i = 10;
        float f = 10;
        double d = 10; // double is default

        // best practice: declare type
        float ff = 10f;
        double dd = 10d;

        //double is greater than float
        double df = 10.25;
        // float fd = 10.25; // error
        float fd = (float) 10.25;
        // not recommended for two reason:
        // 1) float is not common today
        // 2) better 10.25f. Less code;
        float fdf = 10.25f;

        //what if we divide...
        int myint = 11 / 2;
        float myfloat = 11f / 2;
        double mydouble = 11d / 2;
        System.out.println(myint);
        System.out.println(myfloat);
        System.out.println(mydouble);

        // Double deals with more precise
        int myint1 = 11 / 3;
        float myfloat1 = 11f / 3;
        double mydouble1 = 11d / 3;

        System.out.println(myint1);
        System.out.println(myfloat1);
        System.out.println(mydouble1);

        //remember double is the default
        double mydouble_declared = 5.00 / 5.00; //no need d

        /*
        Double is reccomended:
        1) faster calculation (chips deal with double better than float)
        2) Java libraries are pro double
         */


    }
}
