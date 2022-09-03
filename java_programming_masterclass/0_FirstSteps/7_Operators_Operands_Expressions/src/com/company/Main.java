package com.company;

public class Main {

    public static void main(String[] args) {

        /*
        Operators are special symbols to perform
        operations on more than one operands

        Operands are elements involved with
        Operators

        Expression is formed by combining variables,
        literals, method return values and operators
         */

        //An example of expression with
        //Egual operator
        //Sum operator
        int result = 1 + 2;
        System.out.println(result);
        int previousResult = result;
        System.out.println(previousResult);
        result = result - 1;
        System.out.println(result);

        //One important thing is independence
        System.out.println(previousResult);
        //don't change even if we subtract -1 to result

        //multiple operand
        result = result * 10;
        System.out.println(result);

        //division operand
        result = result / 5;
        System.out.println(result);

        // A particular operator is reminder
        result = result % 3;
        System.out.println(result);

        /*
        It's possible to abbreviate Operators
         */

        result++; //add 1
        System.out.println(result);

        result--; //minus 1
        System.out.println(result);

        result+=2; //add different number
        System.out.println(result);

        result*=10;
        System.out.println(result);

        result/=3;
        System.out.println(result);

        result-=5;
        System.out.println(result);
    }
}
