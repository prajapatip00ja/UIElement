package droidelement;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class DroidButtonTest {
    @Test
    public void getIdShouldGiveIdOfTheLabel(){
        DroidButton droidButton = new DroidButton("bt1","ok");
        assertEquals(droidButton.getId(),"bt1");
    }

    @Test
    public void getIdShouldGiveTextOfTheLabel(){
        DroidButton droidButton = new DroidButton("bt1","ok");
        assertEquals(droidButton.getText(),"ok");
    }

}
