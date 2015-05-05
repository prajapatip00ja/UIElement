import droidelement.*;
import org.junit.Test;
import xmlelement.*;

import static junit.framework.Assert.assertEquals;

public class DroidTransformerTest {
    @Test
    public void transformShouldReturnDroidTextView(){
        XmlViewElement label = new Label("lb1","hello");
        Visitor visitor = new DroidVisitor();
        Transformer transformer = new Transformer(visitor);
        DroidTextView textView = (DroidTextView)transformer.transform(label);
        assertEquals(textView.toString(),"lb1 hello");
    }

    @Test
    public void transformShouldReturnDroidButton(){
        XmlViewElement button = new Button("button1","Ok");
        Visitor visitor = new DroidVisitor();
        Transformer transformer = new Transformer(visitor);
        DroidButton droidButton = (DroidButton)transformer.transform(button);
        assertEquals(droidButton.toString(),"button1 Ok");
    }
    @Test
    public void transformShouldReturnDroidGroup(){
        XmlViewElement group = new XmlGroup("group1");
        XmlViewElement button = new Button("button1","Ok");
        ((XmlGroup)group).addElement(button);
        Visitor visitor = new DroidVisitor();
        Transformer transformer = new Transformer(visitor);
        DroidGroup droidGroup = (DroidGroup)transformer.transform(group);
        assertEquals(droidGroup.toString(),"group1"+"\t"+"button1 Ok\n");
    }

}
