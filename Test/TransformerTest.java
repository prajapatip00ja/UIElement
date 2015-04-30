import iosElement.IosButton;
import iosElement.Ios;
import iosElement.IosGroup;
import iosElement.TextField;
import org.junit.Test;
import xmlElement.Button;
import xmlElement.Label;
import xmlElement.Xml;
import xmlElement.XmlGroup;


import static junit.framework.Assert.assertEquals;

public class TransformerTest {

    @Test
    public void transformMethodShouldTransformXmlLabelToIosLabel(){
        Transformer transformer = new Transformer();
        Xml xmlLabel = new Label("lb1","hello");
        Ios textField = transformer.transform(xmlLabel);
        TextField tf = (TextField)textField;
        assertEquals(tf.toString(),"lb1 hello");
    }

    @Test
    public void transformMethodShouldTransformXmlButtonToIosButton(){
        Transformer transformer = new Transformer();
        Xml xmlButton = new Button("b1","ok");
        Ios button = transformer.transform(xmlButton);
        IosButton ioButton1 = (IosButton)button;
        assertEquals(ioButton1.toString(),"b1 ok");
    }

    @Test
    public void transformMethodShouldTransformXmlGroupToIosGroup(){
        Transformer transformer = new Transformer();
        XmlGroup xmlGroup = new XmlGroup("g1");
        Xml label = new Label("lb1","hello");
        Xml button = new Button("b1","ok");
        xmlGroup.addElement(label);
        xmlGroup.addElement(button);
        Ios group = transformer.transform(xmlGroup);
        IosGroup iosGroup = (IosGroup)group;
        assertEquals(iosGroup.toString(),"g1"+"\t"+"lb1 hello"+"\n"+"b1 ok"+"\n");
    }

    @Test
    public void transformMethodShouldTransformXmlGroupToIosGroupWhichIsHavingAnotherGroup(){
        Transformer transformer = new Transformer();
        XmlGroup xmlGroup1 = new XmlGroup("g1");
        XmlGroup xmlGroup2 = new XmlGroup("g2");
        Xml label1 = new Label("lb1","hello");
        Xml label2 = new Label("lb2","hello");
        Xml button1 = new Button("b1","ok");
        Xml button2 = new Button("b2","ok");
        xmlGroup1.addElement(label1);
        xmlGroup2.addElement(label2);
        xmlGroup1.addElement(button1);
        xmlGroup2.addElement(button2);
        xmlGroup1.addElement(xmlGroup2);
        Ios group = transformer.transform(xmlGroup1);
        IosGroup iosGroup = (IosGroup)group;
        assertEquals(iosGroup.toString(),"g1"+"\t"+"lb1 hello"+"\n"+"b1 ok"+"\n"+"g2"+"\t"+"lb2 hello"+"\n"+"b2 ok\n"+"\n");
    }


}
