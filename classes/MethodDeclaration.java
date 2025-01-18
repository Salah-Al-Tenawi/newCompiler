package classes;

import java.util.ArrayList;
import java.util.List;

public class MethodDeclaration {
    String name ;
    List<ParameterList>parameterLists =new ArrayList<>();
    TypeV typeReturn ;
    MethodBody methodBody;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ParameterList> getParameterLists() {
        return parameterLists;
    }

    public void setParameterLists(List<ParameterList> parameterLists) {
        this.parameterLists = parameterLists;
    }

    public TypeV getTypeReturn() {
        return typeReturn;
    }

    public void setTypeReturn(TypeV typeReturn) {
        this.typeReturn = typeReturn;
    }

    public MethodBody getMethodBody() {
        return methodBody;
    }

    public void setMethodBody(MethodBody methodBody) {
        this.methodBody = methodBody;
    }

    @Override
    public String toString() {
        if(typeReturn==null) {
            return "\nMethodDeclaration {" +
               "\nname ="+name +
                    ", \nparameterLists=" + parameterLists +
                    "\nmethodBody {"+methodBody +
                    "\n}" +
                    "\n}";
        }
        if(parameterLists==null) {
            return "\nMethodDeclaration {" +
                    "\nname ="+name +
                    ",typeReturn=" + typeReturn +
                    "\nmethodBody {"+methodBody +
                    "\n}" +
                    "\n}";
        }

        return "\nMethodDeclaration{" +
                "\nname='" + name + '\'' +
                ", \nparameterLists=" + parameterLists +
                ", typeReturn=" + typeReturn +
                ", methodBody{" + methodBody +
                "\n}"+
                "\n}" ;
    }
}
