import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private Guest guest1;

    @Before
    public void before(){
        bedroom1 = new Bedroom(1, 2, "Double", 49.99);
        bedroom2 = new Bedroom(2, 1, "Single", 39.99);
        guest1 = new Guest("John");
    }

    @Test
    public void canAddGuestToBedroom(){
        bedroom1.addGuest(guest1);
        assertEquals(1, bedroom1.countGuest());

    }

    @Test
    public void canRemoveGuest(){
        bedroom1.addGuest(guest1);
        bedroom1.removeGuest(guest1);
        assertEquals(0, bedroom1.countGuest());
    }

}
