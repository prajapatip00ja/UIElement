package ioselement;

import java.util.ArrayList;
import java.util.List;

public class IosGroup {
    private String id;
    private List<Object> elements;

    public IosGroup(String id){
        this.id = id;
        this.elements = new ArrayList<Object>();
    }
    public void addElement(Object element){
        elements.add(element);
    }

    public  String toString(){
        String result = id+"\t";
        for (Object element : elements) {
            result = result+""+element+"\n";
        }
        return result;
    }

    public List<Object> getElements(){
        return elements;
    }

    public String getId() {
        return id;
    }
}
