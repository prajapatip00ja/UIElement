package ioselement;

public class IosButton extends IosViewElement{
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


    @Override
    public void accept(IosVisitor iosVisitor) {

    }

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }
}
