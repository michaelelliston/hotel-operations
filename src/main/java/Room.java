public class Room {
    private int numberOfBeds;
    private double price;
    private boolean clean;
    private boolean occupied;
    private int roomNumber;
    private String roomType;

    public Room(int numberOfBeds, double price, boolean cleaned, boolean occupied, int roomNumber, String roomType) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.clean = cleaned;
        this.occupied = occupied;
        this.roomNumber = roomNumber;
        this.roomType = roomType;
    }

    public int getNumberOfBeds() {
        return this.numberOfBeds;
    }

    public double getPrice() {
        return this.price;
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }

    public String getRoomType() {
        return this.roomType;
    }

    public boolean isOccupied() {
        return this.occupied;
    }

    public boolean isClean() {
        return this.clean;
    }

    public boolean isAvailable() {
        return isClean() && !isOccupied();
    }

    public boolean checkIn() {
        if (this.isAvailable()) {
            this.occupied = true;
            this.clean = false;
            System.out.println("Thank you for checking in!");
            return true;
        } else {
            return false;
        }
    }

    public void checkOut() {
        this.occupied = false;
        cleanRoom();
        System.out.println("Thank you for staying with us! We hope you enjoyed your room.");
    }

    public void cleanRoom() {
        this.clean = true;
        System.out.println("The room has been cleaned!");
    }
}
