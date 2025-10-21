public class Reservation {
    private int roomNumber;
    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean weekend;

    public Reservation(int roomNumber, String roomType, double price, int numberOfNights, boolean weekend) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.price = price;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }

    public String getRoomType() {
        return this.roomType;
    }

    public double getPrice() {
        return this.price;
    }

    public int getNumberOfNights() {
        return this.numberOfNights;
    }

    public boolean isWeekend() {
        return this.weekend;
    }

    public double calculateFinalPrice() {
        double finalPrice = this.price * this.numberOfNights;
        if (isWeekend()) {
            finalPrice = finalPrice * 1.1;
        }
        return finalPrice;
    }
}
