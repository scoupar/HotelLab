import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    private Booking booking;

    @Before
    public void before(){
        booking = new Booking(3);

    }

    @Test
    public void canGetTotalBill(){
        booking.calculateTotalBill();
        assertEquals(149.97, booking.getTotalBill(), 0.0);
    }


}
