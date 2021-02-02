package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor wean;
    Visitor wean2;
    Visitor grownUp;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        wean = new Visitor(13, 125, 2.5);
        wean2 = new Visitor(10, 150, 2.5);
        grownUp = new Visitor(25, 205, 2.5);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void cannotRideIfTooSmall() {
        assertFalse(rollerCoaster.isAllowedTo(wean));
    }

    @Test
    public void cannotRideIfTooYoung() {
        assertFalse(rollerCoaster.isAllowedTo(wean2));
    }

    @Test
    public void canRideIfNotTooYoungOrTooSmall() {
        assertTrue(rollerCoaster.isAllowedTo(grownUp));
    }
}
