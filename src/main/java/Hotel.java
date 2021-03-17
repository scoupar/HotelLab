import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedroom;
    private ArrayList<ConferenceRoom> conferenceRoom;

    public Hotel() {
        this.bedroom = new ArrayList<Bedroom>();
        this.conferenceRoom = new ArrayList<ConferenceRoom>();
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
}
