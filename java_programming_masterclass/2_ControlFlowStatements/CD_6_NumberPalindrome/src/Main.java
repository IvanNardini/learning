public class Main {
    public static void main(String[] args) {

        System.out.println(NumberPalindrome.isPalidrome(-1221)); // should return true
        System.out.println(NumberPalindrome.isPalidrome(707)); //should return true
        System.out.println(NumberPalindrome.isPalidrome(11212)); //should return false because reverse is 21211 and that is not equal to 11212.
    }
}
