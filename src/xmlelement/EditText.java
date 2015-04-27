package xmlelement;

/**
 * Created by poojap on 27/04/15.
 */
public class EditText implements LabelOnly, HintOnly {
    private Label label;
    private String hint;

    public EditText(Label label, String hint) {
        this.label = label;
        this.hint = hint;
    }

    public Label getLabel() {
        return label;
    }

       public String getHint() {
        return hint;
    }
}
