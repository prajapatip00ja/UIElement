package droidelement;

public class DroidTextView extends DroidViewElement{
    private  String id;
    private String text;

    public DroidTextView(String id, String text) {
        this.id = id;
        this.text = text;
    }

    @Override
    public String toString() {
        return super.toString() +" "+ text;
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