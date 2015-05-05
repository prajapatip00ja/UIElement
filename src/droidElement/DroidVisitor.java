package droidelement;

import droidelement.DroidTextView;
import droidelement.DroidViewElement;
import xmlelement.*;

import java.util.List;

public class DroidVisitor extends Visitor {
    private DroidViewElement viewElement1;
    private DroidViewElement viewElement2;

    @Override
    public void visit(Label label) {
        viewElement1 = new DroidTextView(label.getId(),label.getText());
    }

    @Override
    public void visit(Button button) {
        viewElement1 = new DroidButton(button.getId(),button.getText());
    }

    @Override
    public DroidViewElement getElement() {
        return viewElement1;
    }

    @Override
    public void visit(XmlGroup group) {
        viewElement2 = new DroidGroup(group.getId());
        List<Object> elements = group.getElements();
        for (Object element : elements) {
            ((XmlViewElement)element).accept(this);
            if(viewElement2 instanceof DroidGroup){
                ((DroidGroup)viewElement2).addElement(this.getElement());
            }
        }
        viewElement1 = viewElement2;
    }

}
