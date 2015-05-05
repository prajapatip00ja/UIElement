package droidelement;

public class DroidTextView{
    private  String id;
    private String text;

    public DroidTextView(String id, String text) {
        this.id = id;
        this.text = text;
    }

    @Override
    public String toString() {
        return super.toString() +" "+ text;
    }

}