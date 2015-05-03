package droidElement;

import org.junit.Test;
import xmlElement.Label;

import java.util.List;

import static junit.framework.Assert.assertEquals;

public class DroidGroupTest {
    @Test
    public void addElementIsAddingElementsToTheList(){
        DroidGroup droidGroup = new DroidGroup("G1");
        Label label = new Label("lb1","hello");
        droidGroup.addElement(new Label("lb1", "hello"));
        List<Object> elements = droidGroup.getElements();
        for (Object element : elements) {
            assertEquals(element,label);
        }
    }

    @Test
    public void getIdIsGivingIdOfTheGroup(){
        DroidGroup droidGroup = new DroidGroup("G1");
        assertEquals(droidGroup.getId(),"G1");
    }

    @Test
    public void toStringIsGivingStringOfAllElements(){
        DroidGroup droidGroup = new DroidGroup("G1");
        droidGroup.addElement(new Label("lb1","hello"));
        assertEquals(droidGroup.toString(),"G1"+"\t"+"lb1 hello"+"\n");
    }

}
