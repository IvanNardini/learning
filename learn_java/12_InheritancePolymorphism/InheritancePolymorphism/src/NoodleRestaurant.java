class NoodleRestaurant {
    String name;

    public NoodleRestaurant(String customerName){
        name = customerName;
    }

    public void order(Noodle noodle) {
        System.out.println(noodle.getCookPrep());
        System.out.println("Order for " + name + " is ready.");
    }

    public static void main(String[] args) {
        Noodle ramen, pho;
        ramen = new Ramen();
        pho = new Pho();

        NoodleRestaurant customer1 = new NoodleRestaurant("Sagirah");
        NoodleRestaurant customer2 = new NoodleRestaurant("Maritza");
        customer1.order(pho);
        customer2.order(ramen);
    }
}