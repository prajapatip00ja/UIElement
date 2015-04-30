package xmlElement;

import org.junit.Test;

import java.util.List;

import static junit.framework.Assert.assertEquals;

public class XmlGroupTest {
    @Test
    public void addElementIsAddingElementsToTheList(){
        XmlGroup xmlGroup = new XmlGroup("G1");
        Label label = new Label("lb1","hello");
        xmlGroup.addElement(new Label("lb1","hello"));
        List<Object> elements = xmlGroup.getElements();
        for (Object element : elements) {
            assertEquals(element,label);
        }
    }

    @Test
    public void getIdIsGivingIdOfTheGroupe(){
        XmlGroup xmlGroup = new XmlGroup("G1");
        assertEquals(xmlGroup.getId(),"G1");
    }

    @Test
    public void toStringIsGivingStringOfAllElements(){
        XmlGroup xmlGroup = new XmlGroup("G1");
        xmlGroup.addElement(new Label("lb1","hello"));
        assertEquals(xmlGroup.toString(),"G1"+"\n"+" lb1 hello"+"\n");
    }
}
