import droidelement.*;
import org.junit.Test;
import xmlelement.*;

import static junit.framework.Assert.assertEquals;

public class DroidTransformerTest {
    @Test
    public void transformShouldReturnDroidTextView(){
        XmlViewElement label = new Label("lb1","hello");
        Visitor visitor = new DroidVisitor();
        DroidTransformer transformer = new DroidTransformer(visitor);
        DroidTextView textView = (DroidTextView)transformer.transform(label);
        assertEquals(textView.toString(),"lb1 hello");
    }

    @Test
    public void transformShouldReturnDroidButton(){
        XmlViewElement button = new Button("button1","Ok");
        Visitor visitor = new DroidVisitor();
        DroidTransformer transformer = new DroidTransformer(visitor);
        DroidButton droidButton = (DroidButton)transformer.transform(button);
        assertEquals(droidButton.toString(),"button1 Ok");
    }

    @Test
    public void transformShouldReturnDroidGroup(){
        XmlViewElement group = new XmlGroup("group1");
        XmlViewElement button = new Button("button1","Ok");
        ((XmlGroup)group).addElement(button);
        Visitor visitor = new DroidVisitor();
        DroidTransformer transformer = new DroidTransformer(visitor);
        DroidGroup droidGroup = (DroidGroup)transformer.transform(group);
        assertEquals(droidGroup.toString(),"group1"+"\t"+"button1 Ok\n");
    }

    @Test
    public void transformShouldReturnDroidGroupContainingButtonAndGroup(){
        XmlViewElement group1 = new XmlGroup("group1");
        XmlViewElement group2 = new XmlGroup("group2");
        XmlViewElement button1 = new Button("button1","Ok");
        XmlViewElement button2 = new Button("button2","Ok");
        ((XmlGroup)group1).addElement(button1);
        ((XmlGroup)group2).addElement(button2);
        ((XmlGroup)group1).addElement(group2);
        Visitor visitor = new DroidVisitor();
        DroidTransformer transformer = new DroidTransformer(visitor);
        DroidGroup droidGroup = (DroidGroup)transformer.transform(group1);
        assertEquals(droidGroup.toString(),"group1"+"\t"+"button1 Ok\ngroup2"+"\t"+"button2 Ok\n\n");
    }

}
