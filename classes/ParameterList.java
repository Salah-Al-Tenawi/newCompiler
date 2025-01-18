package classes;

import java.util.List;

public class ParameterList {
    List<Parameter> parameters ;

    public List<Parameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
    }

    @Override
    public String toString() {
        return "\nParameterList{" +
                "\nparameters=" + parameters +
                "\n}";
    }
}
