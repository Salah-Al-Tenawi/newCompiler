package classes;

public class StatementMethod {
    String variable ;
    Expression expression ;

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {

        if(variable!=null) {
            return "\nStatementMethod{" +
                    "\n variable =" + variable +
                    "\nExpersion =" + expression+
                    "\n}";
        }
        return
                "\nStatementMethod{" +
                ", \nexpression=" + expression +
                "\n}";
    }
}
