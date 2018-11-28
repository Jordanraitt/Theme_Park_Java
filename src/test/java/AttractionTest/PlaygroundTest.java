package AttractionTest;

import Attractions.Playground;
import Visitor.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;
    Visitor visitor;

    @Before
    public void before() {
        playground = new Playground("Petersburg playground", 0);
    }

    @Test
    public void canGetName() {
        assertEquals("Petersburg playground", playground.getName());
    }

    @Test
    public void canGetIn() {
        visitor = new Visitor(14, 140, 20);
        assertEquals(true, playground.isAllowed(visitor));
    }

    @Test
    public void cannotGetIn() {
        visitor = new Visitor(18, 188, 30);
        assertEquals(false, playground.isAllowed(visitor));
    }
    @Test
    public void canGetRating() {
        assertEquals(0,  playground.getRating());
    }
}
