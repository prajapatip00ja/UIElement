import xmlelement.*;
import droidelement.*;

public class Transformer {
    private Visitor visitor;
    public Transformer(Visitor visitor) {
        this.visitor = visitor;
    }

    public DroidViewElement transform(XmlViewElement element) {
       element.accept(visitor);
       return visitor.getElement();
    }
}
