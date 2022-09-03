// public access modifier (optional)
// class keywords with {} to define a class
public class Hello {

    // access modifier
    // static keyword to find code to run
    // void method not return anything (just print)
    // main and parantesis to define a method
    // String[] args to define arguments of method
    public static void main(String[] args){
        // code block is where you add statements

        //An example of Statement ie complete command
        System.out.println("Hello, Ivan!");

        // An example of Variable
        // DataType, variable name and (optional) expression
        // Declaration Statment where you initialize the variable
        // Initialization in Java is optional
        int myFirstNumber = 10;
        System.out.println(myFirstNumber);

        // An example of Expression  with Java Operators
        int myFirstExpression = (10 + 10) + (2 * 10);
        System.out.println(myFirstExpression);

        // Using different Operators and Expressions
        int mySecondNumber = 12;
        int myThirdNumber = 5 * 10;
        int myTotal = mySecondNumber + myThirdNumber;
        int myLastOne = 1000 - myTotal;
        System.out.println(myLastOne);

    }
}
