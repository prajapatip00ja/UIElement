package ioselement;

public class IosButton {
    private String id;
    private String text;

    public IosButton(String id, String text) {
        this.id = id;
        this.text = text;
    }

    @Override
    public String toString() {
        return super.toString()+" "+text;
    }


    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }
}
