package droidelement;

import java.util.ArrayList;
import java.util.List;

public class DroidGroup extends DroidViewElement{
    private String id;
    private List<Object> elements;

    public DroidGroup(String id){
        this.id = id;
        this.elements = new ArrayList<Object>();
    }

    public void addElement(Object element){
        elements.add(element);
    }
    @Override
    public  String toString(){
        String s = id+"\t";
        for (Object element : elements) {
            s = s+element+"\n";
        }
        return s;
    }

    @Override
    public void accept(DroidVisitor droidVisitor) {

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
