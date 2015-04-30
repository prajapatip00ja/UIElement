import iosElement.ButtonIo;
import iosElement.IosGroup;
import iosElement.TextField;
import xmlElement.Button;
import xmlElement.XmlGroup;
import xmlElement.Label;
import java.util.Vector;

public class Transformer {
//
//    public IosGroup transform(XmlGroup xmlGroup){
//        IosGroup group = new IosGroup(xmlGroup.getId());
//        for (Object xmlElement : xmlElements) {
//              if(xmlElement instanceof Label){
//                  TextField tf = new TextField(((Label)xmlElement).getId(),((Label)xmlElement).getText());
//                  group.addElement(tf);
//              }
//              else if(xmlElement instanceof Button){
//                  ButtonIo ioButton = new ButtonIo(((Button)xmlElement).getId(),((Button)xmlElement).getText());
//                  group.addElement(ioButton);
//              }
//              else if(xmlElement instanceof XmlGroup){
//                  IosGroup iosGroup = transform((XmlGroup)xmlElement);
//                  group.addElement(iosGroup);
//              }
//        }
//        return group;
//    }
//
//    public static  void main(String[] args) {
//        Transformer tf = new Transformer();
//        XmlGroup g1 = new XmlGroup("g1");
//        XmlGroup g2 = new XmlGroup("g2");
//        g2.addElement(new Label("lb2","bye"));
//        g2.addElement(new Button("b2","cancel"));
//        g1.addElement(new Label("lb1", "hello"));
//        g1.addElement(new Button("b1", "OK"));
//        g1.addElement(g2);
//        IosGroup group =  tf.transform(g1);
//        System.out.println(group.toString());
//    }
}
