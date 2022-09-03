class Spaghetti extends Noodle{
    public Spaghetti() {
        super(30.0, 0.2, "round", "semolina flour");
    }
    @Override
    public String getCookPrep() {

        return "Boil spaghetti for 8 - 12 minutes and add sauce, cheese, or oil and garlic.";

    }
}