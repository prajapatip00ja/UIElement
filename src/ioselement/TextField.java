package ioselement;

import xmlelement.EditText;
import xmlelement.Label;
import xmlelement.LabelOnly;

/**
 * Created by poojap on 24/04/15.
 */
public class TextField {
    private Label text;

    public TextField(LabelOnly label) {
        this.text = label.getLabel();
    }

    public String toString() {
        return text.toString();
    }

    public static void main(String[] args) {
        LabelOnly label = new EditText(new Label("lb1","a"),"abc");
        System.out.println(label.getLabel());
    }

}
