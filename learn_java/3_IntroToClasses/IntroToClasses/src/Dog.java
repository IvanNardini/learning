public class Dog {
    // Instance fields
    String breed;
    boolean hasOwner;
    int age;
    String size;

    // Dog constructor
    public Dog(String dogBreed, boolean dogOwned, int dogYears, String dogSize) {
        System.out.println("Constructor invoked!");
        breed = dogBreed;
        hasOwner = dogOwned;
        age = dogYears;
        size = dogSize;
    }

    public static void main(String[] args) {
        System.out.println("Main method started");
        // Create an Dog object called fido (instance fido)
        Dog fido = new Dog("poodle", false, 4, "S");
        // Create an Dog object called nunzio (instance nunzio)
        Dog nunzio = new Dog("shiba inu", true, 12, "M");
        boolean isFidoOlder = fido.age > nunzio.age;
        int totalDogYears = nunzio.age + fido.age;
        boolean hasSameSize = fido.size.equalsIgnoreCase(nunzio.size);
        System.out.println("Two dogs created: a " + fido.breed + " and a " + nunzio.breed);
        System.out.println("The statement that fido is an older dog is: " + isFidoOlder);
        System.out.println("The total age of the dogs is: " + totalDogYears);
        System.out.println("The statement they have same size is: " + hasSameSize);
        System.out.println("Main method finished");
    }
}