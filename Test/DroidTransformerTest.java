import static junit.framework.Assert.assertEquals;

/**
 * Created by saylik on 04/05/15.
 */
//public class DroidTransformerTest {
//    @Test
//    public void transformMethodShouldTransformXmlLabelToDroidTextView(){
//        DroidTransformer transformer = new DroidTransformer();
//        Xml xmlLabel = new Label("lb1","hello");
//        Droid textView = transformer.transformToDroid(xmlLabel);
//        DroidTextView tv = (DroidTextView)textView;
//        assertEquals(tv.toString(),"lb1 hello");
//    }
//
//    @Test
//    public void transformMethodShouldTransformXmlButtonToIoDroidButton(){
//        DroidTransformer transformer = new DroidTransformer();
//        Xml xmlButton = new Button("b1","ok");
//        Droid button = transformer.transformToDroid(xmlButton);
//        DroidButton droidButton = (DroidButton)button;
//        assertEquals(droidButton.toString(),"b1 ok");
//    }
//
//    @Test
//    public void transformMethodShouldTransformXmlGroupToDroidGroup(){
//        DroidTransformer transformer = new DroidTransformer();
//        XmlGroup xmlGroup = new XmlGroup("g1");
//        Xml label = new Label("lb1","hello");
//        Xml button = new Button("b1","ok");
//        xmlGroup.addElement(label);
//        xmlGroup.addElement(button);
//        Droid group = transformer.transformToDroid(xmlGroup);
//        DroidGroup droidGroup = (DroidGroup)group;
//        assertEquals(droidGroup.toString(),"g1"+"\t"+"lb1 hello"+"\n"+"b1 ok"+"\n");
//    }
//
//    @Test
//    public void transformMethodShouldTransformXmlGroupToDroidGroupWhichIsHavingAnotherGroup(){
//        DroidTransformer transformer = new DroidTransformer();
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
//        Droid group = transformer.transformToDroid(xmlGroup1);
//        DroidGroup droidGroup = (DroidGroup)group;
//        assertEquals(droidGroup.toString(),"g1"+"\t"+"lb1 hello"+"\n"+"b1 ok"+"\n"+"g2"+"\t"+"lb2 hello"+"\n"+"b2 ok\n"+"\n");
//    }
//
//}
