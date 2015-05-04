package iosElement;


public class TextField extends Ios {
    private String text;


    public TextField(String id,String text) {
        super(id);
        this.text = text;
    }

    public String toString() {
        return super.toString()+" "+text;
    }

}
