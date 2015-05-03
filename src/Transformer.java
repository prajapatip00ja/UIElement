import droidElement.Droid;
import droidElement.DroidButton;
import droidElement.DroidGroup;
import droidElement.DroidTextView;
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

    public Ios transformToIos(Xml element){
        if(element instanceof Label)
            return new TextField(((Label)element).getId(),((Label)element).getText());
        else if(element instanceof Button)
            return new IosButton(((Button)element).getId(),((Button)element).getText());
        else
            return transformIosGroup((XmlGroup) element);
    }

    private Ios transformIosGroup(XmlGroup xmlGroup) {
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
                group.addElement(transformIosGroup((XmlGroup) element));
            }
        }
        return group;
    }

    public Droid transformToDroid(Xml element){
        if(element instanceof Label)
            return new DroidTextView(((Label)element).getId(),((Label)element).getText());
        else if(element instanceof Button)
            return new DroidButton(((Button)element).getId(),((Button)element).getText());
        else
            return transformDroidGroup((XmlGroup)element);


    }

    private Droid transformDroidGroup(XmlGroup xmlGroup) {
        DroidGroup group = new DroidGroup(xmlGroup.getId());
        List<Object> xmlElements = xmlGroup.getElements();
        for (Object element : xmlElements) {
            if(element instanceof Label){
                group.addElement(new DroidTextView(((Label) element).getId(), ((Label) element).getText()));
            }
            else if(element instanceof Button){
                group.addElement(new DroidButton(((Button) element).getId(), ((Button) element).getText()));
            }
            else{
                group.addElement(transformIosGroup((XmlGroup) element));
            }
        }
        return group;
    }


}
