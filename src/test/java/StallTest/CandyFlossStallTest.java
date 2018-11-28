package StallTest;

import Stall.CandyFlossStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {

    CandyFlossStall candyFlossStall;

    @Before
    public void before() {
        candyFlossStall = new CandyFlossStall("Gut Floss", "Ron Pearlman", 1, 0);
    }

    @Test
    public void canGetName() {
        assertEquals("Gut Floss", candyFlossStall.getName());
    }

    @Test
    public void canGetOwnerName() {
        assertEquals("Ron Pearlman", candyFlossStall.getOwnerName());
    }

    @Test
    public void canGetParkingSpot() {
        assertEquals(1, candyFlossStall.getParkingSpot());
    }

    @Test
    public void canGetRating() {
        assertEquals(0,  candyFlossStall.getRating());
    }
}
