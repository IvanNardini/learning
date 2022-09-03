public class Order {

    // Instance fields for an order
    boolean isFilled;
    double billAmount;
    String shipping;
    String couponCode;

    // Constructor
    public Order(boolean filled, double cost, String shippingMethod, String coupon){
        if (cost > 24.00){
            System.out.println("High value item!"); //Single if statetment
        }
        isFilled = filled;
        billAmount = cost;
        shipping = shippingMethod;
        couponCode = coupon;
    }

    // Methods
//    Calculate Shipping
//    public double calculateShipping(){
//        if (shipping.equals("Regular")) { //If-else statement
//            return 0;
//        } else if (shipping.equals("Express")) {
//            if (couponCode.equals("ship50")){ //Nested if statement
//                return .85;
//            } else {
//                return 1.75;
//            }
//        } else {
//            return .50;
//        }
//    }

    public double calculateShipping(){
        double shippingCost;
        switch (shipping){ //switch statement
            case "Regular":
                shippingCost = 0;
                break; // need break otherwise it executes code
            case "Express":
                shippingCost = 1.75;
                break;
            default:
                shippingCost = .50;
        }
        return shippingCost;
    }

    // Ship
    public void ship(){
        if (isFilled){
            System.out.println("Shipping");
            System.out.println("Shipping cost: " + calculateShipping());
        } else {
            System.out.println("Order not ready");
        }
    }

    public static void main(String[] args) {
        System.out.println("Book order");
        Order book = new Order(true, 9.99, "Express", "ship50");
        book.ship();
        System.out.println("\nChemistry Set order");
        Order chemistrySet = new Order(false, 72.50, "Regular", "freeShipping");
        chemistrySet.ship();
        System.out.println("\nMy Test order");
        Order myTestOrder = new Order(true, 2.00, "Express", "freeShipping");
        myTestOrder.ship();

    }
}
