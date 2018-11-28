package VisitorTest;

import Visitor.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void before() {
        visitor = new Visitor(18, 182, 100);
    }

    @Test
    public void canGetAge() {
        assertEquals(18, visitor.getAge());
    }

    @Test
    public void canGetHeight() {
        assertEquals(182, visitor.getHeight());
    }

    @Test
    public void canGetMoney() {
        assertEquals(100, visitor.getMoney());
    }
}
