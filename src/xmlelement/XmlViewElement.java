package xmlelement;
import droidelement.Visitor;

/**
 * Created by saylik on 05/05/15.
 */
public abstract class XmlViewElement {
    public abstract void accept(Visitor xmlVisitor);
    public abstract String getId();
    public abstract String getText();
}
