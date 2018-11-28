package  Attractions;

import Interfaces.ISecurity;
import Visitor.Visitor;

public class Playground extends Attraction implements ISecurity {

    public Playground(String name, int rating){
        super(name, rating);
    }

    public boolean isAllowed(Visitor visitor) {
        if (visitor.getAge() >= 15) {
            return false;
        }
        return true;
    }
}
