package classes;

public class CssValue {
    String ID_CSS ;

    public String getID_CSS() {
        return ID_CSS;
    }

    public void setID_CSS(String ID_CSS) {
        this.ID_CSS = ID_CSS;
    }

    @Override
    public String toString() {
        return "\nCssValue{" +
                "\nID_CSS='" + ID_CSS + '\'' +
                "\n}";
    }
}
