package droidelement;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class DroidButtonTest {
    @Test
    public void getIdShouldGiveIdOfTheButton(){
        DroidButton droidButton = new DroidButton("bt1","ok");
        assertEquals(droidButton.getId(),"bt1");
    }

    @Test
    public void getIdShouldGiveTextOfTheButton(){
        DroidButton droidButton = new DroidButton("bt1","ok");
        assertEquals(droidButton.getText(),"ok");
    }

}
