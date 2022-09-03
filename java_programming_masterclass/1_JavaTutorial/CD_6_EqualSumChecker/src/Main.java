public class Main {
    public static void main(String[] args) {
        boolean X = EqualSumChecker.hasEqualSum(1, 1, 1);  //should return false since 1 + 1 is not equal to 1
        boolean Y = EqualSumChecker.hasEqualSum(1, 1, 2);  //should return true since 1 + 1 is equal to 2
        boolean Z = EqualSumChecker.hasEqualSum(1, -1, 0);  //should return true since 1 + (-1) is 1 - 1 and is equal to 0

        System.out.println(X);
        System.out.println(Y);
        System.out.println(Z);
    }
}
