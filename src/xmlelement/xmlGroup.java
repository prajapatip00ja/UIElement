package xmlelement;

import java.util.ArrayList;
import java.util.List;

public class XmlGroup extends Xml{
    private List<Object> elements;

    public XmlGroup(String id){
        super(id);
        this.elements = new ArrayList<Object>();
    }

    public void addElement(Object element){
        elements.add(element);
    }

    public  String toString(){
        String s = super.toString()+"\n";
        for (Object element : elements) {
            s = s+" "+element+"\n";
        }
        return s;
    }

    public String getId(){
        return super.toString();
    }

    public List<Object> getElements() {
        return elements;
    }
}
