package droidelement;

public class DroidButton extends Droid {
    private String text;

    public DroidButton(String id, String text) {
        super(id);
        this.text = text;
    }

    @Override
    public String toString() {
        return  super.toString() +" "+ text;
    }
}
