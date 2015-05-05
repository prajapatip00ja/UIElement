package xmlelement;

public class Label extends XmlViewElement{

    private String id;
    private String text;

    public Label(String id, String text) {
        this.id = id;
        this.text = text;
    }

    @Override
    public void accept(XmlVisitor xmlVisitor) {

    }

    public String getId(){
        return id;
    }

    public String getText(){
        return text;
    }

    @Override
    public String toString() {
        return id+" "+text;
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Label)){
            return false;
        }
        Label label = (Label)o;
        return this.text.equals(label.text);
    }

    @Override
    public int hashCode() {
        return text != null ? text.hashCode() : 0;
    }
}
