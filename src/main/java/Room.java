public class Room {
    private int numberOfBeds;
    private double price;
    private boolean clean;
    private boolean occupied;
    private boolean available;
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
        if (this.clean == true && this.occupied == false) {
            return this.available = true;
        } else {
            return this.available = false;
        }
    }
}
