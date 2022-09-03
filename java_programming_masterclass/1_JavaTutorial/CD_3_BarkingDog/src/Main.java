public class Main {

    public static void main(String[] args) {
        boolean EXONE = BarkingDog.shouldWakeUp (true, 1); // should return true
        boolean EXTWO = BarkingDog.shouldWakeUp (false, 2); // should return false since the dog is not barking.
        boolean EXTHREE = BarkingDog.shouldWakeUp (true, 8); // should return false, since it's not before 8.
        boolean EXFOUR = BarkingDog.shouldWakeUp (true, -1); // should return false since the hourOfDay parameter needs to be in a range 0-23
        System.out.println(EXONE);
        System.out.println(EXTWO);
        System.out.println(EXTHREE);
        System.out.println(EXFOUR);
    }
}
