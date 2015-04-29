package ioselement;

import java.util.Vector;
public class IOsGroup extends Ios{
    private Vector v;

    public IOsGroup(String id){
        super(id);
        this.v = new Vector();
    }
    public void addElement(Object element){
        v.add(element);
    }

    public  String toString(){
        String s = super.toString()+"\n";
        for (Object element : v) {
            s = s+"  "+element+"\n";
        }
        return s;
    }
}
