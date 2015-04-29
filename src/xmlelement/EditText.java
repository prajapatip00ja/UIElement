package xmlelement;

public class EditText extends Xml {
    private Label label;
    private String hint;

    public EditText(String id,Label label, String hint) {
        super(id);
        this.label = label;
        this.hint = hint;
    }

//    public Label getLabel() {
//        return label;
//    }
//
//      public String getHint() {
//        return hint;
//    }
}
