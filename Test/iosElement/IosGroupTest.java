package ioselement;

import org.junit.Test;
import xmlelement.Label;

import java.util.List;

import static junit.framework.Assert.assertEquals;

public class IosGroupTest {
    @Test
    public void addElementIsAddingElementsToTheList(){
        IosGroup iosGroup = new IosGroup("G1");
        Label label = new Label("lb1","hello");
        iosGroup.addElement(new Label("lb1", "hello"));
        List<Object> elements = iosGroup.getElements();
        for (Object element : elements) {
            assertEquals(element,label);
        }
    }

    @Test
    public void getIdIsGivingIdOfTheGroup(){
        IosGroup iosGroup = new IosGroup("G1");
        assertEquals(iosGroup.getId(),"G1");
    }

    @Test
    public void toStringIsGivingStringOfAllElements(){
        IosGroup iosGroup = new IosGroup("G1");
        iosGroup.addElement(new Label("lb1","hello"));
        assertEquals(iosGroup.toString(),"G1"+"\t"+"lb1 hello"+"\n");
    }



}
