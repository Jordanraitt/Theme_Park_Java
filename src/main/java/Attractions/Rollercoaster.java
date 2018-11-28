package Attractions;

import Interfaces.ISecurity;
import Visitor.Visitor;

public class Rollercoaster extends Attraction implements ISecurity {

    public Rollercoaster(String name, int rating){
        super(name, rating);
    }

    public boolean isAllowed(Visitor visitor){
        if (visitor.getHeight() <= 145 && visitor.getAge() <= 12){
            return false;
        }
        return true;
    }
}
