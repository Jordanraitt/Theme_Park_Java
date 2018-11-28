package AttractionTest;

import Attractions.Dodgems;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;

    @Before
    public void before() {
        dodgems = new Dodgems("Wherly Durley", 0);
    }

    @Test
    public void canGetName() {
        assertEquals("Wherly Durley", dodgems.getName());
    }

    @Test
    public void canGetRating() {
        assertEquals(0,  dodgems.getRating());
    }
}

