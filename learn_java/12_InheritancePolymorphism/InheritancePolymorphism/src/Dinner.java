public class Dinner {
    private void makeNoodles(Noodle noodle, String sauce){
        noodle.cook();
        System.out.println("Mixing " + noodle.texture + " noodles made from " + noodle.ingredients + " with " + sauce + ".");
        System.out.println("Dinner is served!");
    }

    public static void main(String[] args){
        Dinner noodlesDinner = new Dinner();
        Noodle biangBiang = new BiangBiang(); // here we use a child class as a parent class
        noodlesDinner.makeNoodles(biangBiang, "soy sauce and chili oil");
    }
}
