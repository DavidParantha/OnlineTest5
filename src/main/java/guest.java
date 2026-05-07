abstract class guest {
    protected int guestID;
    protected String guestName;
    protected int daysStayed;

    public guest(int daysStayed, String guestName, int guestID) {
        this.daysStayed = daysStayed;
        this.guestName = guestName;
        this.guestID = guestID;
    }

    public int getDaysStayed() {
        return daysStayed;
    }

    public void setDaysStayed(int daysStayed) {
        this.daysStayed = daysStayed;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }
    public abstract double calculatedBill();
}

class StandardRoom extends guest {

    public StandardRoom(int guestId, String guestName, int daysStayed) {
        super(guestId, guestName, daysStayed);
    }

    @Override
    public double calculatedBill() {
        return daysStayed * 2000;
    }
}
class DeluxeRoom extends guest {

    public DeluxeRoom(int guestId, String guestName, int daysStayed) {
        super(guestId, guestName, daysStayed);
    }

    @Override
    public double calculatedBill() {
        return daysStayed * 4000;
    }

}
class SuiteRoom extends guest {

    public SuiteRoom(int guestId, String guestName, int daysStayed) {
        super(guestId, guestName, daysStayed);
    }

    @Override
    public double calculatedBill() {
        return 0;
    }

}
class InvalidRoomTypeException extends Exception {

    public InvalidRoomTypeException(String message) {
        super(message);
    }
}
class InvalidStayException extends Exception {

    public InvalidStayException(String message) {
        super(message);
    }
}