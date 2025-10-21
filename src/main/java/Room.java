public class Room {
    private int numberOfBeds;
    private double price;
    private boolean clean;
    private boolean occupied;
    private boolean available;

    public Room(int numberOfBeds, double price, boolean cleaned, boolean occupied) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.clean = cleaned;
        this.occupied = occupied;
    }

    public int getNumberOfBeds() {
        return this.numberOfBeds;
    }

    public double getPrice() {
        return this.price;
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
