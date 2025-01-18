package classes;

public class VariableDeclaration {
    String constv ;
    String let ;
    String var ;
Expression expression;
    public String getConstv() {
        return constv;
    }

    public void setConstv(String constv) {
        this.constv = constv;
    }

    public String getLet() {
        return let;
    }

    public void setLet(String let) {
        this.let = let;
    }

    public String getVar() {
        return var;
    }

    public void setVar(String var) {
        this.var = var;
    }

    @Override
    public String toString() {
        if(let!=null) {
            return "\nVariableDeclaration{" +
                    "\nlet =" +let +

                    "\n expression {" +expression +
                    "\n}";
        }
        if(constv!=null) {
            return "\nVariableDeclaration{" +
                    "\nconst =" +constv +

                    "\n expression {" +expression +
                    "\n}";
        }


        return "\nVariableDeclaration{" +

                "\n var=" + var + '\'' +
                "\n expression {" +expression +
                "\n}";
    }
}
