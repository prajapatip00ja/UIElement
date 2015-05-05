package droidelement;

import xmlelement.*;

public abstract class Visitor {
    public abstract void visit(Label label);
    public abstract void visit(Button button);
    public abstract DroidViewElement getElement();
    public abstract void  visit(XmlGroup group);
}

