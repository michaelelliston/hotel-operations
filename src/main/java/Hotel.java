public class Hotel {
    String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfRooms = numberOfRooms;
        this.numberOfSuites = numberOfSuites;
        this.bookedBasicRooms = 0;
        this.bookedSuites = 0;
    }

    public boolean bookRooms(int numberOfRooms, boolean isSuite) {
        if (isSuite) {
            if (numberOfRooms <= this.getAvailableSuites()) {
                this.bookedSuites = this.bookedSuites + numberOfRooms;
                System.out.println("Your rooms have been booked!");
                return true;
            } else {
                System.out.println("There aren't enough rooms available to book that many!");
                return false;
            }
        } else if (numberOfRooms <= this.getAvailableRooms()) {
            this.bookedBasicRooms = this.bookedBasicRooms + numberOfRooms;
            System.out.println("Your rooms have been booked!");
            return true;
        } else {
            System.out.println("There aren't enough rooms available to book that many!");
            return false;
        }
    }

    public int getAvailableSuites() {
        return this.numberOfSuites - this.bookedSuites;
    }

    public int getAvailableRooms() {
        return this.numberOfRooms - this.bookedBasicRooms;
    }
}


