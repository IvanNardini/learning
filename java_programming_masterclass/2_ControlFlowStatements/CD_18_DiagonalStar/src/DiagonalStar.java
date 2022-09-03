public class DiagonalStar {

//    Write a method named printSquareStar with one parameter of type int named number.
//    If number is < 5, the method should print "Invalid Value".
//    The method should print diagonals to generate a rectangular pattern composed of stars (*).
//    This should be accomplished by using loops (see examples below).

    public static void printSquareStar (int number) {

        for (int columnNumber = 1; columnNumber <= number; columnNumber++) {

            if (number < 5) {
                System.out.println("Invalid Value");
                break;
            }

            for (int rowNumber = 1; rowNumber <= number; rowNumber++) { // column number equals rowCount - currentRow + 1

                if (columnNumber == 1 || columnNumber == number || rowNumber == 1 || rowNumber == number) {
                    System.out.print("*");
                } else if (rowNumber == columnNumber || columnNumber == number - rowNumber + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        if (number <= 0) {
            System.out.println("Invalid Value");
        }
    }
}
