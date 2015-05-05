package xmlelement;

import droidelement.Visitor;

import java.util.ArrayList;
import java.util.List;

public class XmlGroup extends XmlViewElement{
    private String id;
    private List<Object> elements;

    public XmlGroup(String id){
        this.id = id;
        this.elements = new ArrayList<Object>();
    }

    public void addElement(Object element){
        elements.add(element);
    }

    public  String toString(){
        String s = id+"\n";
        for (Object element : elements) {
            s = s+" "+element+"\n";
        }
        return s;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);

    }

    public String getId(){
        return id;
    }

    @Override
    public String getText() {
        return null;
    }


    public List<Object> getElements() {
        return elements;
    }
}
