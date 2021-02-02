import attractions.Dodgems;
import attractions.Park;
import attractions.Playground;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;
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
    }

    @Test
    public void canGetAllReviewed() {
        assertEquals(7, balmichaelVisitorCentre.getAllReviewed().size());
    }
}
