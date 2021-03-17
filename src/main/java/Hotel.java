import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {

    private ArrayList<Bedroom> bedroom;
    private ArrayList<ConferenceRoom> conferenceRoom;
    private Booking booking;
    private HashMap<String, DiningRoom> diningRoomHashMap;


    public Hotel() {
        this.bedroom = new ArrayList<Bedroom>();
        this.conferenceRoom = new ArrayList<ConferenceRoom>();
        this.booking = new Booking(3);
        this.diningRoomHashMap = new HashMap<String, DiningRoom>();
    }

    public ArrayList<Bedroom> getBedroom() {
        return bedroom;
    }

    public ArrayList<ConferenceRoom> getConferenceRoom() {
        return conferenceRoom;
    }

    public void checkIn(Bedroom bedroom1, Guest guest1){
        bedroom1.addGuest(guest1);
    }

    public void checkOut(Bedroom bedroom1, Guest guest1){
        bedroom1.removeGuest(guest1);
    }

    public Booking bookRoom(Bedroom bedroom1, Booking booking){
        booking.setNightsBooked(3);
        return this.booking;
    }
}
