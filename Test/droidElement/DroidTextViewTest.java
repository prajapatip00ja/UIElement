package droidelement;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class DroidTextViewTest {
    @Test
    public void GetIdShouldGiveIdOfTheDroidTextView(){
        DroidTextView droidTextView= new DroidTextView("label1","Hello");
        assertEquals(droidTextView.getId(),"label1");
    }

    @Test
    public void GetIdShouldGiveTextOfTheDroidTextView(){
        DroidTextView droidTextView= new DroidTextView("label1","Hello");
        assertEquals(droidTextView.getText(),"Hello");
    }

}
