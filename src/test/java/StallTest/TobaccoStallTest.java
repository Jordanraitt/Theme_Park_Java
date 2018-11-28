package StallTest;

import Stall.TobaccoStall;
import Visitor.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitor;

    @Before
    public void before() {
        tobaccoStall = new TobaccoStall("Gut Floss", "Ron Pearlman", 1, 0);
    }

    @Test
    public void canGetName() {
        assertEquals("Gut Floss", tobaccoStall.getName());
    }

    @Test
    public void canGetOwnerName() {
        assertEquals("Ron Pearlman", tobaccoStall.getOwnerName());
    }

    @Test
    public void canGetParkingSpot() {
        assertEquals(1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void canGetIn() {
        visitor = new Visitor(20, 180, 100);
        assertEquals(true, tobaccoStall.isAllowed(visitor));
    }

    @Test
    public void cannotGetIn() {
        visitor = new Visitor(15, 160, 40);
        assertEquals(false, tobaccoStall.isAllowed(visitor));
    }
    @Test
    public void canGetRating() {
        assertEquals(0,  tobaccoStall.getRating());
    }
}
