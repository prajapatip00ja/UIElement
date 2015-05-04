package iosElement;

public class IosButton extends Ios {
    private String text;

    public IosButton(String id, String text) {
        super(id);
        this.text = text;
    }

    @Override
    public String toString() {
        return super.toString()+" "+text;
    }


}
