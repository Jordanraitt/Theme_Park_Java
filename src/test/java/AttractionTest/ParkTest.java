package AttractionTest;

import Attractions.Park;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;

    @Before
    public void before() {
        park = new Park("Ghost Town", 0);
    }

    @Test
    public void canGetName() {
        assertEquals("Ghost Town", park.getName());
    }

    @Test
    public void canGetRating() {
        assertEquals(0,  park.getRating());
    }
}
