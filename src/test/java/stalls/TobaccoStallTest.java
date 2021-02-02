package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor wean;
    Visitor grownUp;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1, 7);
        wean = new Visitor(10, 125, 2.5);
        grownUp = new Visitor(25, 205, 2.5);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void cannotSellCigarettesToUnder18s() {
        assertFalse(tobaccoStall.isAllowedTo(wean));
    }

    @Test
    public void canSellCigarettesToOver18s() {
        assertTrue(tobaccoStall.isAllowedTo(grownUp));
    }
}
