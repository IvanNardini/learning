public class Noodle {

    protected double lenghtInCentimeters;
    protected double widthCentimeters;
    protected String shape;
    protected String ingredients;
    protected String texture = "brittle";

    public Noodle(double lenghtInCentimeters, double widthCentimeters, String shape, String ingredients) {
        this.lenghtInCentimeters = lenghtInCentimeters;
        this.widthCentimeters = widthCentimeters;
        this.shape = shape;
        this.ingredients = ingredients;
    }

    public void cook(){
        System.out.println("Boiling.");
        this.texture = "cooked";
    }

    public String getCookPrep(){
        return "Boil noodle for 7 minutes and add sauce.";
    }

    final public boolean isTasty(){
        return true;
    }

//    public static void main(String[] args){
////        Spaghetti spaghettiPomodoro = new Spaghetti(20, 20, "long", "soup");
////        System.out.println(spaghettiPomodoro.texture);
////        Pho pho = new Pho();
////        System.out.println(pho.shape);
////        Ramen yasaiRamen = new Ramen();
////        System.out.println(yasaiRamen.isTasty());
////        System.out.println(yasaiRamen.ingredients);
//        Spaetzle kaesespaetzle = new Spaetzle();
//        kaesespaetzle.cook();
//    }
    public static void main(String[] args) {
        Noodle spaghetti, ramen, pho; //declare
        spaghetti = new Spaghetti();
        ramen = new Ramen();
        pho = new Pho();
        Noodle[] allTheNoodles = {spaghetti, ramen, pho};
        for(Noodle noodle : allTheNoodles){
            System.out.println(noodle.getCookPrep());
        }
    }
}
