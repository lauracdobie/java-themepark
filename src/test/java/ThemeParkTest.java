import attractions.Dodgems;
import attractions.Park;
import attractions.Playground;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.CandyflossStall;
import stalls.IceCreamStall;
import stalls.ParkingSpot;
import stalls.TobaccoStall;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    Dodgems dodgems;
    Park park;
    Playground playground;
    RollerCoaster rollerCoaster;
    CandyflossStall candyflossStall;
    IceCreamStall iceCreamStall;
    TobaccoStall tobaccoStall;
    ThemePark balmichaelVisitorCentre;
    Visitor grownUp;

    @Before
    public void before() {
        dodgems = new Dodgems("Zippy Dodgems", 5);
        park = new Park("Dystopian Hill", 4);
        playground =  new Playground("Hazardous Game Zone", 2);
        rollerCoaster = new RollerCoaster("Love Rollercoaster", 10);
        iceCreamStall = new IceCreamStall("Gelati Divini", "Marco da Mosta", ParkingSpot.A1, 8);
        tobaccoStall = new TobaccoStall("Tabac", "Jerry Cigarette", ParkingSpot.B3, 6);
        candyflossStall = new CandyflossStall("Sweet Dreams", "Sarah Sugar", ParkingSpot.B4, 7);
        balmichaelVisitorCentre = new ThemePark(dodgems, park, playground, rollerCoaster, candyflossStall, iceCreamStall, tobaccoStall);
        grownUp = new Visitor(25, 205, 2.5);
    }

    @Test
    public void canGetAllReviewed() {
        assertEquals(7, balmichaelVisitorCentre.getAllReviewed().size());
    }

    @Test
    public void visitorCanVisitAttraction() {
        balmichaelVisitorCentre.visit(grownUp, dodgems);
        assertEquals(1, grownUp.getVisitedAttractions().size());
        assertEquals(1, dodgems.getVisitCount());
    }

    @Test
    public void canGetReviews() {
        assertEquals(7, balmichaelVisitorCentre.getReviews().size());
    }

    @Test
    public void canGetAllowedAttractions() {
        assertEquals(2, balmichaelVisitorCentre.getAllowed(grownUp).size());

    }
}
