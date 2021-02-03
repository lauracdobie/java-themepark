import attractions.*;
import behaviours.IReviewed;
import behaviours.ISecurity;
import org.w3c.dom.Attr;
import people.Visitor;
import stalls.*;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;

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

    public void visit(Visitor visitor, Attraction attraction) {
        attraction.setVisitCount(attraction.getVisitCount() + 1);
        visitor.addAttraction(attraction);
    }

    public HashMap getReviews() {
        HashMap<String, Integer> reviews = new HashMap<>();
        ArrayList<IReviewed> reviewedAttractions = getAllReviewed();

        for (IReviewed attraction : reviewedAttractions) {
            String key = attraction.getName();
            int value = attraction.getRating();
            reviews.put(key, value);
        }

        return reviews;
    }

    public ArrayList getAllowed(Visitor visitor) {
        ArrayList<IReviewed> allAttractions = getAllReviewed();
        ArrayList<IReviewed> allowedAttractions = new ArrayList<>();

        for (IReviewed attraction : allAttractions) {
            if (attraction instanceof ISecurity) {
                if (((ISecurity) attraction).isAllowedTo(visitor)) {
                    allowedAttractions.add(attraction);
                }

            }
        }

        return allowedAttractions;
    }

    public ArrayList getAllAllowed(Visitor visitor) {
        ArrayList<IReviewed> allAttractions = getAllReviewed();
        ArrayList<IReviewed> allowedAttractions = getAllowed(visitor);

        for (IReviewed attraction : allAttractions) {
            if (!(attraction instanceof ISecurity)) {
                allowedAttractions.add(attraction);
            }
        }

        return allowedAttractions;
    }

}
