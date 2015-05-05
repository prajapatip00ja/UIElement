package ioselement;


public class TextField {
    private String id;
    private String text;


    public TextField(String id,String text) {
        this.id = id;
        this.text = text;
    }

    public String toString() {
        return super.toString()+" "+text;
    }

}
