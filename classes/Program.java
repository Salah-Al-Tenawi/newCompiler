package classes;

import java.util.ArrayList;
import java.util.List;

public class Program {
    List<Statment> statments = new ArrayList<>();

    public List<Statment> getStatments() {
        return statments;
    }

    public void setStatments(List<Statment> statments) {
        this.statments = statments;
    }

    @Override
    public String toString() {
        return "\n Program{" +
                "\n statments=" + statments +
                "\n }";
    }
}
