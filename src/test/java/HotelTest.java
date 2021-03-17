import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom1;
    Bedroom bedroom2;
    ConferenceRoom conferenceRoom1;
    ConferenceRoom conferenceRoom2;
    Guest guest1;

    @Before
    public void before(){
        hotel = new Hotel();
        bedroom1 = new Bedroom(1, 2, "Double");
        bedroom2 = new Bedroom(2, 1, "Single");
        conferenceRoom1 = new ConferenceRoom("Conference Room 1 ", 50);
        conferenceRoom2 = new ConferenceRoom("Conference Room 2", 20);
        guest1 = new Guest("John");

    }

    @Test
    public void canCheckInGuest(){
        hotel.checkIn(bedroom1, guest1);
        assertEquals(true, bedroom1.isOccupied());

    }

    @Test
    public void canCheckOutGuest(){
        hotel.checkIn(bedroom1, guest1);
        hotel.checkOut(bedroom1, guest1);
        assertEquals(false, bedroom1.isOccupied() );
    }
}
