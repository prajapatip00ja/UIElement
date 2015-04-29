package ioselement;

import xmlelement.Button;

/**
 * Created by poojap on 27/04/15.
 */
public class ButtonIo extends Ios {
    private String text;

    public ButtonIo(String id, String text) {
        super(id);
        this.text = text;
    }

    @Override
    public String toString() {
        return super.toString()+" "+text;
    }

}
