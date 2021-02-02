import attractions.*;
import behaviours.IReviewed;
import stalls.*;

import java.util.ArrayList;

public class ThemePark {
    Dodgems dodgems;
    Park park;
    Playground playground;
    RollerCoaster rollerCoaster;
    CandyflossStall candyflossStall;
    IceCreamStall iceCreamStall;
    TobaccoStall tobaccoStall;


    public ThemePark(Dodgems dodgems, Park park, Playground playground, RollerCoaster rollerCoaster, CandyflossStall candyflossStall, IceCreamStall iceCreamStall, TobaccoStall tobaccoStall) {
        this.dodgems = dodgems;
        this.park = park;
        this.playground = playground;
        this.rollerCoaster = rollerCoaster;
        this.candyflossStall = candyflossStall;
        this.iceCreamStall = iceCreamStall;
        this.tobaccoStall = tobaccoStall;
    }

    public ArrayList getAllReviewed() {
        ArrayList<IReviewed> allReviewed = new ArrayList<>();
        allReviewed.add(this.dodgems);
        allReviewed.add(this.park);
        allReviewed.add(this.playground);
        allReviewed.add(this.rollerCoaster);
        allReviewed.add(this.candyflossStall);
        allReviewed.add(this.iceCreamStall);
        allReviewed.add(this.tobaccoStall);

        return allReviewed;
    }
}
