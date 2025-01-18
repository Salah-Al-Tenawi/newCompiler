package classes;

public class Statment {

    ComponentDeclaration componentDeclaration ;
    ClassDeclaration classDeclaration;
    InterfaceDeclaration interfaceDeclaration ;
    MethodDeclaration methodDeclaration ;
    VariableDeclaration variableDeclaration ;
    ImportDeclaration importDeclaration ;

    public ComponentDeclaration getComponentDeclaration() {
        return componentDeclaration;
    }

    public void setComponentDeclaration(ComponentDeclaration componentDeclaration) {
        this.componentDeclaration = componentDeclaration;
    }

    public ClassDeclaration getClassDeclaration() {
        return classDeclaration;
    }

    public void setClassDeclaration(ClassDeclaration classDeclaration) {
        this.classDeclaration = classDeclaration;
    }

    public InterfaceDeclaration getInterfaceDeclaration() {
        return interfaceDeclaration;
    }

    public void setInterfaceDeclaration(InterfaceDeclaration interfaceDeclaration) {
        this.interfaceDeclaration = interfaceDeclaration;
    }

    public MethodDeclaration getMethodDeclaration() {
        return methodDeclaration;
    }

    public void setMethodDeclaration(MethodDeclaration methodDeclaration) {
        this.methodDeclaration = methodDeclaration;
    }

    public VariableDeclaration getVariableDeclaration() {
        return variableDeclaration;
    }

    public void setVariableDeclaration(VariableDeclaration variableDeclaration) {
        this.variableDeclaration = variableDeclaration;
    }

    public ImportDeclaration getImportDeclaration() {
        return importDeclaration;
    }

    public void setImportDeclaration(ImportDeclaration importDeclaration) {
        this.importDeclaration = importDeclaration;
    }

    @Override
    public String toString() {
        return "Statment{" +
                "componentDeclaration=" + componentDeclaration +
                ", classDeclaration=" + classDeclaration +
                ", interfaceDeclaration=" + interfaceDeclaration +
                ", methodDeclaration=" + methodDeclaration +
                ", variableDeclaration=" + variableDeclaration +
                ", importDeclaration=" + importDeclaration +
                '}';
    }
}

