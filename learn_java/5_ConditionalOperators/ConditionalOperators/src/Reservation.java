import java.rmi.server.RemoteServer;

public class Reservation {
    // Instance fields
    int guestCount;
    int restaurantCapacity;
    boolean isRestaurantOpen;
    boolean isConfirmed;

    // Constructor
    public Reservation(int count, int capacity, boolean open){
        if (count < 1 || count > 8){ //Conditional-OR
            System.out.println("Invalid reservation!");
        }
        guestCount = count;
        restaurantCapacity = capacity;
        isRestaurantOpen = open;
    }

    public void confirmReservation(){
        if (restaurantCapacity >= guestCount && isRestaurantOpen){ //Conditional-AND
            System.out.println("Reservation confirmed");
            isConfirmed = true;
        } else {
            System.out.println("Reservation denied");
            isConfirmed = false;
        }
    }

    public void informUser() {
        if (!isConfirmed){
            System.out.println("Unable to confirm reservation, please contact restaurant.");
        } else {
            System.out.println("Please enjoy your meal!");
        }
    }

    public static void main(String[] args){
        Reservation partyofThree = new Reservation(3, 12, true);
        Reservation partyofFour = new Reservation(4,3,true);
        partyofThree.confirmReservation();
        partyofThree.informUser();
        partyofFour.confirmReservation();
        partyofFour.informUser();
    }

}
