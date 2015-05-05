package xmlelement;

public class Button{
    private String id;
    private String text;

    public Button(String id, String text) {
        this.id = id;
        this.text = text;
    }

    @Override
    public String toString() {
        return id+" "+text;
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
        return id;
    }

    public String getText() {
        return text;
    }
}
