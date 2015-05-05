import ioselement.IosButton;
import ioselement.Ios;
import ioselement.IosGroup;
import ioselement.TextField;
import org.junit.Test;
import xmlelement.Button;
import xmlelement.Label;
import xmlelement.Xml;
import xmlelement.XmlGroup;


import static junit.framework.Assert.assertEquals;

//public class IosTransformerTest {
//
//    @Test
//    public void transformMethodShouldTransformXmlLabelToIosLabel(){
//        IosTransformer transformer = new IosTransformer();
//        Xml xmlLabel = new Label("lb1","hello");
//        Ios textField = transformer.transformToIos(xmlLabel);
//        TextField tf = (TextField)textField;
//        assertEquals(tf.toString(),"lb1 hello");
//    }
//
//    @Test
//    public void transformMethodShouldTransformXmlButtonToIosButton(){
//        IosTransformer transformer = new IosTransformer();
//        Xml xmlButton = new Button("b1","ok");
//        Ios button = transformer.transformToIos(xmlButton);
//        IosButton ioButton1 = (IosButton)button;
//        assertEquals(ioButton1.toString(),"b1 ok");
//    }
//
//    @Test
//    public void transformMethodShouldTransformXmlGroupToIosGroup(){
//        IosTransformer transformer = new IosTransformer();
//        XmlGroup xmlGroup = new XmlGroup("g1");
//        Xml label = new Label("lb1","hello");
//        Xml button = new Button("b1","ok");
//        xmlGroup.addElement(label);
//        xmlGroup.addElement(button);
//        Ios group = transformer.transformToIos(xmlGroup);
//        IosGroup iosGroup = (IosGroup)group;
//        assertEquals(iosGroup.toString(),"g1"+"\t"+"lb1 hello"+"\n"+"b1 ok"+"\n");
//    }
//
//    @Test
//    public void transformMethodShouldTransformXmlGroupToIosGroupWhichIsHavingAnotherGroup(){
//        IosTransformer transformer = new IosTransformer();
//        XmlGroup xmlGroup1 = new XmlGroup("g1");
//        XmlGroup xmlGroup2 = new XmlGroup("g2");
//        Xml label1 = new Label("lb1","hello");
//        Xml label2 = new Label("lb2","hello");
//        Xml button1 = new Button("b1","ok");
//        Xml button2 = new Button("b2","ok");
//        xmlGroup1.addElement(label1);
//        xmlGroup2.addElement(label2);
//        xmlGroup1.addElement(button1);
//        xmlGroup2.addElement(button2);
//        xmlGroup1.addElement(xmlGroup2);
//        Ios group = transformer.transformToIos(xmlGroup1);
//        IosGroup iosGroup = (IosGroup)group;
//        assertEquals(iosGroup.toString(),"g1"+"\t"+"lb1 hello"+"\n"+"b1 ok"+"\n"+"g2"+"\t"+"lb2 hello"+"\n"+"b2 ok\n"+"\n");
//    }
//}
