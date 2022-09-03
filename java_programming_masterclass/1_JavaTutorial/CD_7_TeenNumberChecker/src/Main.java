public class Main {
    public static void main(String[] args) {
        boolean RO=TeenNumberChecker.hasTeen(9, 99, 19);  //should return true since 19 is in range 13 - 19
        boolean RT=TeenNumberChecker.hasTeen(23, 15, 42); //should return true since 15 is in range 13 - 19
        boolean RTH=TeenNumberChecker.hasTeen(22, 23, 34); //should return false since numbers 22, 23, 34 are not in range 13-19

        System.out.println(RO);
        System.out.println(RT);
        System.out.println(RTH);

        RO=TeenNumberChecker.isTeen(9);  //should return false since 9 is in not range 13 - 19
        RT=TeenNumberChecker.isTeen(13); //should return true since 13 is in range 13 - 19

        System.out.println(RO);
        System.out.println(RT);
    }
}
