import java.util.ArrayList;
import java.util.Scanner;

public class HotelOperations {

    static ArrayList<Room> rooms = new ArrayList<Room>();

    static ArrayList<Reservation> reservations = new ArrayList<Reservation>();

    static ArrayList<Employee> employees = new ArrayList<Employee>();

    static ArrayList<Hotel> hotels = new ArrayList<Hotel>();

    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        int menuSelection;

        Room room1 = new Room(2, 139, true, false, 1, "king");
        rooms.add(room1);

        Hotel hotel1 = new Hotel("Grand Hotel", 17, 33, 12, 28);
        hotels.add(hotel1);

        Employee employee1 = new Employee(73, "Michael", "Help Desk", 12.50, 44);
        employees.add(employee1);

        employee1.punchTimeCard(true);

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
                        System.out.printf("\nThank you, your room has been reserved for " + r.getNumberOfNights() + " nights, at a total price of $%.2f\n", r.calculateFinalPrice());
                    }
                } else {
                    System.out.println("Sorry, that room is currently unavailable.");
                }
            }
        }

        System.out.println("The number of available regular rooms is: " + hotel1.getAvailableRooms());

        System.out.println("The number of available suites is: " + hotel1.getAvailableSuites());

        boolean result = hotel1.bookRooms(1, true);
        System.out.println("The number of available suites now is: " + hotel1.getAvailableSuites());

        System.out.println("Able to book room?: " + result);

        System.out.printf(employee1.getName() + " was paid $%.2f\n", employee1.getTotalPay());

        employee1.punchTimeCard(false);

        room1.checkOut();
    }
}
