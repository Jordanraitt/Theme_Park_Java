package Interfaces;

import Visitor.Visitor;

public interface ISecurity {

    public boolean isAllowed(Visitor visitor);
}
