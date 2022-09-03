public class Store {
    // Scope of Store class

    // Instance fields or variable (has-a relationship)
    // Declaration is inside the class
    String productType;
    int inventoryCount;
    double inventoryPrice;

    // This is a constructor to create an instance of class (object)
    // It shares the same name with the class.
    // To create an instance we call constructor in main method.
    // Each instance has a state. And it is determined combining fields and constructor.
    // Instance variables are either passed as params in constructor method (formal params --> actual params)
    // or are set as default in case no constructor is defined.
    // Notice params are important because you can have several constructors with same name
    // But they do have different parameters (constructor overloading)

    public Store(String product, int count, double price){
        productType = product;
        inventoryCount = count;
        inventoryPrice = price;
        //Scope of Store method (constructor)
        //System.out.println("I am inside the constructor method");
    }

    // End of Store scope (constructor)

    public static void main(String[] args){
        //Scope of main method

        // Program tasks here
        // System.out.println("Start of the main method");

        // This is a reference data type (the value of the variable is referred
        // to an instance's memory address).
        // Notice our constructor has a parameter. We need to pass a value as its argument.
        // Use Store type to initialize lemonade as new Store instance
        // This is also called Call by Value and lemonade is a actual parameter
        // Don't forget ORDER matters!
        //Store lemonadeStand = new Store("lemonade", 20, 10.50);
        //System.out.println(lemonadeStand);
        //System.out.println(lemonadeStand.productType);
        //System.out.println(lemonadeStand.inventoryCount);
        //System.out.println(lemonadeStand.inventoryPrice);
         Store cookieShop = new Store("cookies", 12, 3.75);
    }
    // End of main scope
}
// End of Store scope



