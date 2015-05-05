package droidelement;

public class DroidButton extends DroidViewElement{

    private String id;
    private String text;

    public DroidButton(String id, String text) {
        this.id = id;
        this.text = text;
    }

    @Override
    public String toString() {
        return  id+" "+ text;
    }

    @Override
    public void accept(DroidVisitor droidVisitor) {

    }

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }
}
