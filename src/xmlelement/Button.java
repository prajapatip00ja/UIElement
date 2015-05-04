package xmlElement;

public class Button extends Xml {
    private String text;

    public Button(String id, String text) {
        super(id);
        this.text = text;
    }

    @Override
    public String toString() {
        return super.toString()+" "+text;
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Button)){
            return false;
        }
        Button button = (Button)o;
        return this.text.equals(button.text);
    }

    @Override
    public int hashCode() {
        return text != null ? text.hashCode() : 0;
    }

    public String getId() {
        return super.toString();
    }

    public String getText() {
        return text;
    }
}
