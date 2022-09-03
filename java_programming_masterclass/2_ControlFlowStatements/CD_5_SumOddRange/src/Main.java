public class Main {

    public static void main(String[] args) {
        System.out.println(SumOddRange.sumOdd(1, 100)); // should return 2500
        System.out.println(SumOddRange.sumOdd(-1, 100)); // should return -1
        System.out.println(SumOddRange.sumOdd(100, 100)); // should return 0
        System.out.println(SumOddRange.sumOdd(13, 13)); // should return 13 (This set contains one number, 13, and it is odd)
        System.out.println(SumOddRange.sumOdd(100, -100)); // should return -1
        System.out.println(SumOddRange.sumOdd(100, 1000));  // should return 247500
    }
}
