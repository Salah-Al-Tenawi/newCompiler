package classes;

public class BodyCssElement {
CssValue cssValue ;

    public CssValue getCssValue() {
        return cssValue;
    }

    public void setCssValue(CssValue cssValue) {
        this.cssValue = cssValue;
    }

    @Override
    public String toString() {
        return "\nBodyCssElement{" +
                "\ncssValue=" + cssValue +
                "\n}";
    }
}
