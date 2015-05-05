package xmlelement;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by saylik on 05/05/15.
 */
public class LabelTest {
    @Test
    public void GetIdShouldGiveIdOfTheLabel(){
        Label label = new Label("label1","Hello");
        assertEquals(label.getId(),"label1");
    }

    @Test
    public void GetIdShouldGiveTextOfTheLabel(){
        Label label = new Label("label1","Hello");
        assertEquals(label.getText(),"Hello");
    }

}
