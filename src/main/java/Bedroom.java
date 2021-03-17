import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private ArrayList <Guest> guest;
    private String roomType;
    private double nightlyRate;

    public Bedroom (int roomNumber, int capacity, String roomType, double nightlyRate){
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.guest = new ArrayList<Guest>();
        this.roomType = roomType;
        this.nightlyRate = nightlyRate;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int countGuest(){
        return this.guest.size();
    }

    public void addGuest(Guest guest1){
        this.guest.add(guest1);
    }

    public boolean isOccupied(){
        if(countGuest() > 0){
            return true;
        } else {
            return false;
        }
    }

    public void removeGuest(Guest guest1){
        this.guest.remove(guest1);
    }

    public double getNightlyRate() {
        return nightlyRate;
    }

    public void setNightlyRate(double nightlyRate) {
        this.nightlyRate = nightlyRate;
    }
}
