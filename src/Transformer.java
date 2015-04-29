import ioselement.ButtonIo;
import ioselement.IOsGroup;
import ioselement.Ios;
import ioselement.TextField;
import xmlelement.Button;
import xmlelement.Xml;
import xmlelement.XmlGroup;
import xmlelement.Label;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;


public class Transformer {
    private  Map<Xml, Ios> elementMapper = new HashMap<Xml, Ios>();

    private void putData(){
        Label label = new Label("lb1","hello");
        TextField tf = new TextField("tf1","hello");
        elementMapper.put(label,tf);
        Button xmlButton = new Button("b1","OK") ;
        ButtonIo iosButton = new ButtonIo("b1","OK") ;
        elementMapper.put(xmlButton, iosButton);
    }


    public IOsGroup transform(XmlGroup xmlGroup){
        IOsGroup group = new IOsGroup("g1");
        Vector xmlElements = xmlGroup.getV();
        for (Object xmlElement : xmlElements) {
              if(xmlElement instanceof Label){
                  TextField tf = (TextField)elementMapper.get(xmlElement);
                  group.addElement(tf);
              }
              else if(xmlElement instanceof Button){
                  ButtonIo button = (ButtonIo)elementMapper.get(xmlElement);
                  group.addElement(button);
              }
        }
        return group;
    }

    public static  void main(String[] args) {
        Transformer tf = new Transformer();
        tf.putData();
        XmlGroup g1 = new XmlGroup("g1");
        g1.addElement(new Label("lb1", "hello"));
        g1.addElement(new Button("b1", "OK"));
        IOsGroup group =  tf.transform(g1);
        System.out.println(group.toString());
    }
}
