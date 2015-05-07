import xmlelement.*;
import droidelement.*;

public class DroidTransformer {
    private Visitor visitor;
    public DroidTransformer(Visitor visitor) {
        this.visitor = visitor;
    }

    public DroidViewElement transform(XmlViewElement element) {
       element.accept(visitor);
       return visitor.getElement();
    }
}
