package ioselement;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by saylik on 05/05/15.
 */
public class TextFieldTest {
    @Test
    public void getIdShouldGiveIdOfTheTextField(){
        TextField textField= new TextField("bt1","ok");
        assertEquals(textField.getId(),"bt1");
    }

    @Test
    public void getIdShouldGiveTextOfTheTextField(){
        TextField textField= new TextField("bt1","ok");
        assertEquals(textField.getText(),"ok");
    }

}
