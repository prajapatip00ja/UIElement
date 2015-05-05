package droidelement;

public class DroidButton{

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

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }
}
