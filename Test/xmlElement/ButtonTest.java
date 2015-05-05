package xmlelement;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by saylik on 05/05/15.
 */
public class ButtonTest {
    @Test
    public void GetIdShouldGiveIdOfTheLabel(){
        Button button = new Button("bt1","ok");
        assertEquals(button.getId(),"bt1");
    }

    @Test
    public void GetIdShouldGiveTextOfTheLabel(){
        Button button = new Button("bt1","ok");
        assertEquals(button.getText(),"ok");
    }

}
