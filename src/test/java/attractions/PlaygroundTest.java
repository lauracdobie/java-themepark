package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class PlaygroundTest {
    Playground playground;
    Visitor wean;
    Visitor grownUp;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        wean = new Visitor(10, 125, 2.5);
        grownUp = new Visitor(25, 205, 2.5);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void canAdmitUnder15s() {
        assertTrue(playground.isAllowedTo(wean));
    }

    @Test
    public void cannotAdmitOver15s() {
        assertFalse(playground.isAllowedTo(grownUp));
    }

}
