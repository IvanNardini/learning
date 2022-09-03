public class Store {
    // instance fields
    String productType;
    double price;

    //constructor method
    public Store(String product, double initialPrice){
        productType = product;
        price = initialPrice;
    }

    //advertise method
    public void advertise(){
        String message = "Selling " + productType + "!";
        //System.out.println("Come spend some money!");
        System.out.println(message);
    }

    //greetCustomer method
    public void greetCustomer(String customer){
        System.out.println("Welcome to the store, " + customer + "!");
    }

    //increasePrice
    public void increasePrice(double priceToAdd){
        price = price + priceToAdd;
    }

    //getPriceWithTax
    public double getPriceWithTax(){
        return price + price * 0.08;
    }

    //toString
    public String toString(){
        String message = "This store sells " + productType + " at a price of " + price + ".";
        return message;
    }

    //main method
    public static void main(String[] args){

        String cookie = "Cookies";
        Store cookieShop = new Store(cookie, 1);
        cookieShop.advertise();

        String product = "Lemonade";
        double initialPrice = 3.75;
        String customerName = "Ivan";
        double priceToAdd = 1.5;

        Store lemonadeStand = new Store(product, initialPrice);
        double price = lemonadeStand.price;
        System.out.println(price);

        lemonadeStand.advertise();
        lemonadeStand.greetCustomer(customerName);

        lemonadeStand.increasePrice(priceToAdd);
        System.out.println(lemonadeStand.price);

        double finalPrice = lemonadeStand.getPriceWithTax();
        System.out.println(finalPrice);

        System.out.println(lemonadeStand);
        System.out.println(cookieShop);

    }
}
