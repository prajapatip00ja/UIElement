package droidelement;

/**
 * Created by saylik on 05/05/15.
 */
public abstract class DroidViewElement {
    public abstract void accept(DroidVisitor droidVisitor);
    public abstract String getId();
    public abstract String getText();
}
