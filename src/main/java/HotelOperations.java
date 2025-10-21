import java.util.Scanner;

public class HotelOperations {

    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        int menuSelection;

        Room room1 = new Room(2, 80, true, true);

        System.out.print("""
                Please select a room:
                \t1) Room 1
                """);

        menuSelection = Integer.parseInt(myScanner.nextLine());

        switch (menuSelection) {
            case 1 -> {
                if (room1.isAvailable()) {
                    System.out.println("This room is available! It has "
                            + room1.getNumberOfBeds() + " beds, and costs $"
                            + room1.getPrice() + ", would you like to rent it?");
                } else {
                    System.out.println("Sorry, that room is currently unavailable.");
                }
            }
        }
    }
}
