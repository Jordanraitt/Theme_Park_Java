package AttractionTest;

import Attractions.Rollercoaster;
import Visitor.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;
    Visitor visitor;

    @Before
    public void before() {
        rollercoaster = new Rollercoaster("West Coaster", 0);
    }

    @Test
    public void canGetName() {
        assertEquals("West Coaster", rollercoaster.getName());
    }

    @Test
    public void canGetOn() {
        visitor = new Visitor(20, 170,  200);
        assertEquals(true, rollercoaster.isAllowed(visitor));
    }

    @Test
    public void cannotGetOn() {
        visitor = new Visitor(11, 140, 1000);
        assertEquals(false, rollercoaster.isAllowed(visitor));
    }
    @Test
    public void canGetRating() {
        assertEquals(0,  rollercoaster.getRating());
    }
}
