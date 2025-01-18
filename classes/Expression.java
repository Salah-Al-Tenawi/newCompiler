package classes;

public class Expression {
    String string ;
    double number ;
    boolean isboolean;
    VariableDeclaration variableDeclaration ;
    FunctionCall functionCall ;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public boolean isIsboolean() {
        return isboolean;
    }

    public void setIsboolean(boolean isboolean) {
        this.isboolean = isboolean;
    }

    public VariableDeclaration getVariableDeclaration() {
        return variableDeclaration;
    }

    public void setVariableDeclaration(VariableDeclaration variableDeclaration) {
        this.variableDeclaration = variableDeclaration;
    }

    public FunctionCall getFunctionCall() {
        return functionCall;
    }

    public void setFunctionCall(FunctionCall functionCall) {
        this.functionCall = functionCall;
    }

    @Override
    public String toString() {
        if(string!=null) {
            return "\nExpression {" +
                    "\nstring" + string +
                     "\n}";
        }
        if(variableDeclaration!=null) {
            return "\nExpression {" +
                    "\nvariableDeclaration" +variableDeclaration +
                    "\n}";
        }
        if(functionCall!=null) {
            return "\nExpression {" +
                    "\nfunctionCall" +functionCall +
                    "\n}";
        }

            return "\nExpression {" +
                    "\nnumber" +number +
                    "\n}";

} }