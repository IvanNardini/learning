public class Main {

    public static void main(String[] args) {
        IntEqualityPrinter.printEqual(1, 1, 1); //should print text All numbers are equal
        IntEqualityPrinter.printEqual(1, 1, 2); //should print text Neither all are equal or different
        IntEqualityPrinter.printEqual(-1, -1, -1); //should print text Invalid Value
        IntEqualityPrinter.printEqual(1, 2, 3); //should print text All numbers are different
    }
}
