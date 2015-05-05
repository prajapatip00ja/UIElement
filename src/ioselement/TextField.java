package ioselement;


public class TextField extends IosViewElement{
    private String id;
    private String text;


    public TextField(String id,String text) {
        this.id = id;
        this.text = text;
    }

    public String toString() {
        return super.toString()+" "+text;
    }

//    @Override
//    public void accept(IosVisitor iosVisitor) {
//
//    }

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }
}
