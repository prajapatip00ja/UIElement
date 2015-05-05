package ioselement;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class IosButtonTest {
    @Test
    public void getIdShouldGiveIdOfTheButton(){
        IosButton iosButton = new IosButton("bt1","ok");
        assertEquals(iosButton.getId(),"bt1");
    }

    @Test
    public void getIdShouldGiveTextOfTheButton(){
        IosButton iosButton = new IosButton("bt1","ok");
        assertEquals(iosButton.getText(),"ok");
    }

}
