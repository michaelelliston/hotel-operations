import java.util.ArrayList;
import java.util.Scanner;

public class HotelOperations {

    static ArrayList<Room> rooms = new ArrayList<Room>();

    static ArrayList<Reservation> reservations = new ArrayList<Reservation>();

    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        int menuSelection;

        Room room1 = new Room(2, 139, true, false, 1, "king");
        rooms.add(room1);

        System.out.print("""
                Please select a room:
                \t1) Room 1
                """);

        menuSelection = Integer.parseInt(myScanner.nextLine());

        switch (menuSelection) {
            case 1 -> {
                if (room1.isAvailable()) {
                    System.out.println("This room is available! It has "
                            + room1.getNumberOfBeds() + " " + room1.getRoomType() + " beds, and costs $"
                            + room1.getPrice() + ", would you like to rent it? Y/N:");
                    String userInput = myScanner.nextLine().trim();

                    if (userInput.equalsIgnoreCase("y")) {
                        System.out.println("For how many nights?: ");
                        int numberOfNights = Integer.parseInt(myScanner.nextLine());
                        Reservation r = new Reservation (room1.getRoomNumber(), room1.getRoomType(), room1.getPrice(), numberOfNights, true);
                        reservations.add(r);
                        room1.checkIn();
                        System.out.println("Thank you, your room has been reserved for " + r.getNumberOfNights() + " nights, at a total price of $" + r.calculateFinalPrice());
                    }
                } else {
                    System.out.println("Sorry, that room is currently unavailable.");
                }
            }
        }
    }
}
