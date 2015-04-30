import iosElement.IosButton;
import iosElement.Ios;
import iosElement.IosGroup;
import iosElement.TextField;
import xmlElement.Button;
import xmlElement.Label;
import xmlElement.Xml;
import xmlElement.XmlGroup;

import java.util.List;

public class Transformer {

    public Ios transform(Xml element){
        if(element instanceof Label)
            return new TextField(((Label)element).getId(),((Label)element).getText());
        else if(element instanceof Button)
            return new IosButton(((Button)element).getId(),((Button)element).getText());
        else
            return transformGroup((XmlGroup)element);
    }

    private Ios transformGroup(XmlGroup xmlGroup) {
        IosGroup group = new IosGroup(xmlGroup.getId());
        List<Object> xmlElements = xmlGroup.getElements();
        for (Object element : xmlElements) {
            if(element instanceof Label){
             group.addElement(new TextField(((Label) element).getId(), ((Label) element).getText()));
            }
            else if(element instanceof Button){
              group.addElement(new IosButton(((Button) element).getId(), ((Button) element).getText()));
            }
            else{
                group.addElement(transformGroup((XmlGroup)element));
            }
        }
        return group;
    }





}
