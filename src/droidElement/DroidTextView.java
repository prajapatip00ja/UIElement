package droidelement;

public class DroidTextView extends Droid {
    private String text;

    public DroidTextView(String id, String text) {
        super(id);
        this.text = text;
    }
    @Override
    public String toString() {
        return super.toString() +" "+ text;
    }

}