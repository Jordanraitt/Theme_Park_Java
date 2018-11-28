package Stall;

import Interfaces.ISecurity;
import Visitor.Visitor;

public class TobaccoStall extends Stall implements ISecurity {

    public TobaccoStall(String name, String ownerName, int parkingSpot, int rating){
        super(name, ownerName, parkingSpot, rating);
    }

    public boolean isAllowed(Visitor visitor) {
        if (visitor.getAge() >= 18) {
            return true;
        }
        return false;
    }
}
