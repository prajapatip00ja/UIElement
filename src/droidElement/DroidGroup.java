package droidelement;

import java.util.ArrayList;
import java.util.List;

public class DroidGroup{
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
        String s = super.toString()+"\t";
        for (Object element : elements) {
            s = s+element+"\n";
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
