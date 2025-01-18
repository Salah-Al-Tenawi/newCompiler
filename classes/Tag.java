package classes;

import java.util.List;

public class Tag {
OpeningTag openingTag ;
List<Element>elements ;
ClosingTag closingTag;
SelfClosingTag selfClosingTag ;

    public SelfClosingTag getSelfClosingTag() {
        return selfClosingTag;
    }

    public void setSelfClosingTag(SelfClosingTag selfClosingTag) {
        this.selfClosingTag = selfClosingTag;
    }

    public ClosingTag getClosingTag() {
        return closingTag;
    }

    public void setClosingTag(ClosingTag closingTag) {
        this.closingTag = closingTag;
    }

    public List<Element> getElements() {
        return elements;
    }

    public void setElements(List<Element> elements) {
        this.elements = elements;
    }

    public OpeningTag getOpeningTag() {
        return openingTag;
    }

    public void setOpeningTag(OpeningTag openingTag) {
        this.openingTag = openingTag;
    }

    @Override
    public String toString() {

        if(elements!=null)
            return "\nTag{"+
                    "\nopeningTag=" + openingTag +
                    "\n, elements=" + elements +
                    "\n, closingTag=" + closingTag +
                    "\n}";

        return "\nTag{"+
                "\nopeningTag=" + openingTag +
                "\nselfClosingTag=" + selfClosingTag +
                "\n, closingTag=" + closingTag +
                "\n}";

    }

}
