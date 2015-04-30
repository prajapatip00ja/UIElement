package androidElement;

import xmlElement.Label;

/**
 * Created by poojap on 24/04/15.
 */
public class LabelView extends Label {
        private int colorCode;

    public LabelView(String id, String text, int colorCode) {
        super(id, text);
        this.colorCode = colorCode;
    }


    public String tvToString() {
        return "LabelView{" + toString() +
                "colorCode=" + colorCode +
                '}';
    }

    public static void main(String[] args) {
        LabelView tv =new LabelView("tv1","pooja",123);
        System.out.println(tv.tvToString());
    }

}
