package ThemeParkTest;

import Attractions.Dodgems;
import Attractions.Park;
import Attractions.Playground;
import Attractions.Rollercoaster;
import Interfaces.IReviewed;
import Stall.CandyFlossStall;
import Stall.IceCreamStall;
import Stall.TobaccoStall;
import ThemePark.ThemePark;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;

    Dodgems dodgems;
    Park park;
    Playground playground;
    Rollercoaster rollercoaster;

    CandyFlossStall candyFlossStall;
    IceCreamStall iceCreamStall;
    TobaccoStall tobaccoStall;

    @Before
    public void before() {
        ArrayList<IReviewed> reviewAll = new ArrayList<>();
        reviewAll.add(dodgems);
        reviewAll.add(park);
        reviewAll.add(playground);
        reviewAll.add(rollercoaster);
        reviewAll.add(candyFlossStall);
        reviewAll.add(iceCreamStall);
        reviewAll.add(tobaccoStall);
        themePark = new ThemePark("name", reviewAll);
    }

    @Test
    public void canGetReviewAll(){
        assertEquals(7, themePark.getReviewAll().size());
    }


}
