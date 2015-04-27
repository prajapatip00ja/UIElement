package ioselement;

import org.junit.Test;
import xmlelement.EditText;
import xmlelement.Label;
import xmlelement.LabelOnly;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

/**
 * Created by poojap on 27/04/15.
 */
public class TextFieldTest {
    @Test
    public void getLabelReturnsText(){
       LabelOnly label = new EditText(new Label("lb1","a"),"abc");
       String s = "lb1a";
       assertTrue(label.getLabel().equals(s));
    }
}
