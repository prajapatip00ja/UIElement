package ioselement;


public class EditText extends Ios{
    private String hint;

    public EditText(String id, String hint) {
        super(id);
        this.hint = hint;
    }

    @Override
    public String toString() {
        return "EditText{" +
                "hint='" + hint + '\'' +
                '}';
    }
}
