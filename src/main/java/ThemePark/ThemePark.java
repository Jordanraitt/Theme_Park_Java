package ThemePark;

import Interfaces.IReviewed;
import java.util.ArrayList;

public class ThemePark {

    private String name;
    private ArrayList<IReviewed> reviewAll;

    public ThemePark(String name, ArrayList<IReviewed> reviewAll) {
        this.name = name;
        this.reviewAll = reviewAll;
    }

    public String getName() {
        return name;
    }

    public ArrayList<IReviewed> getReviewAll() {
        return reviewAll;
    }
}
