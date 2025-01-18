package classes;

import java.util.ArrayList;
import java.util.List;

public class FunctionCall {
    String nameFun;
    List<Argument> arguments =new ArrayList<>();

    public List<Argument> getArguments() {
        return arguments;
    }

    public void setArguments(List<Argument> arguments) {
        this.arguments = arguments;
    }

    @Override
    public String toString() {
        return "\nFunctionCall{" +
                "\n nameFun"+nameFun+
                "\narguments=" + arguments +
                "\n}";
    }
}
