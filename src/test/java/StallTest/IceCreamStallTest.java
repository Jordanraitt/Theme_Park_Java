package StallTest;

import Stall.IceCreamStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    IceCreamStall iceCreamStall;

    @Before
    public void before() {
        iceCreamStall = new IceCreamStall("Gut Floss", "Ron Pearlman", 1, 0);
    }

    @Test
    public void canGetName() {
        assertEquals("Gut Floss", iceCreamStall.getName());
    }

    @Test
    public void canGetOwnerName() {
        assertEquals("Ron Pearlman", iceCreamStall.getOwnerName());
    }

    @Test
    public void canGetParkingSpot() {
        assertEquals(1, iceCreamStall.getParkingSpot());
    }

    @Test
    public void canGetRating() {
        assertEquals(0,  iceCreamStall.getRating());
    }
}
