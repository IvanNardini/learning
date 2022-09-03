public class IntEqualityPrinter {
    private static final String INVALID_MESSAGE = "Invalid Value";
    private static final String MESSAGE_EQUAL = "All numbers are equal";
    private static final String MESSAGE_DIFFERENT = "All numbers are different";
    private static final String MESSAGE_NOR = "Neither all are equal or different";

    // Write a method printEqual with 3 parameters of type int.
    // The method should not return anything (void).
    public static void printEqual(int x, int y, int z) {
        // If one of the parameters is less than 0, print text "Invalid Value".
        // If all numbers are equal print text "All numbers are equal"
        // If all numbers are different print text "All numbers are different".
        // Otherwise, print "Neither all are equal or different".
        if (x < 0 || y < 0 || z < 0) {
            System.out.println(INVALID_MESSAGE);
        } else if ((x == y) && (y == z)) {
            System.out.println(MESSAGE_EQUAL);
        } else if ((x != y) && (y != z) && (x != z)) {
            System.out.println(MESSAGE_DIFFERENT);
        } else {
            System.out.println(MESSAGE_NOR);
        }
    }
}