package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor wean;
    Visitor grownUp;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
        wean = new Visitor(10, 125, 2.5);
        grownUp = new Visitor(25, 205, 2.5);
    }

    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void chargesUnder12sHalf() {
        assertEquals(2.25, dodgems.priceFor(wean), 0.0);
    }

    @Test
    public void chargesOver12sDefault() {
        assertEquals(4.50, dodgems.priceFor(grownUp), 0.0);
    }
}
