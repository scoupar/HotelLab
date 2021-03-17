import org.junit.Before;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom1;
    Guest guest1;


    @Before
    public void before(){
        conferenceRoom1 = new ConferenceRoom("Conference Room 1", 50);
        guest1 = new Guest("John");
    }


}
