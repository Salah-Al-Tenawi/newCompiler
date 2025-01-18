package classes;

import java.util.ArrayList;
import java.util.List;

public class CssElement {
    List<BodyCssElement> bodyCssElements =new ArrayList<>();

    public List<BodyCssElement> getBodyCssElements() {
        return bodyCssElements;
    }

    public void setBodyCssElements(List<BodyCssElement> bodyCssElements) {
        this.bodyCssElements = bodyCssElements;
    }

    @Override
    public String toString() {
        return "\nCssElement{" +
                "\nbodyCssElements=" + bodyCssElements +
                "\n}";
    }
}
