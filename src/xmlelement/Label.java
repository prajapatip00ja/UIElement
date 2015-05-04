package xmlElement;

public class Label extends Xml {

    private String text;

    public Label(String id, String text) {
        super(id);
        this.text = text;
    }

    public String getId(){
        return super.toString();
    }

    public String getText(){
        return text;
    }
//    public String getText() {
//        return text;
//    }

    @Override
    public String toString() {
        return super.toString()+" "+text;
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
