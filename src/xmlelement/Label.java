package xmlelement;

/**
 * Created by poojap on 24/04/15.
 */
public class Label {
    private String id;
    private String text;

    public Label(String id, String text) {
        this.id = id;
        this.text = text;
    }

    public String getId() {
        return id;
    }


    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return id+text;
    }
}
