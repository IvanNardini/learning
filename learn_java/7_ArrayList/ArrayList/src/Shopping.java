import java.util.ArrayList;

public class Shopping {
    public static void main(String[] args){

        String[] groceryItems = {"steak", "milk", "jelly beans"};
        double[] prices = {25.00, 2.95, 2.50};

        groceryItems[3] = "ham"; // arrays cannot be modified.
        prices[3] = 4.99;

    }
}
