package classes;

public class InterfaceMember {
    PropertyDeclaration propertyDeclaration ;
    MethodDeclaration methodDeclaration;

    public PropertyDeclaration getPropertyDeclaration() {
        return propertyDeclaration;
    }

    public void setPropertyDeclaration(PropertyDeclaration propertyDeclaration) {
        this.propertyDeclaration = propertyDeclaration;
    }

    public MethodDeclaration getMethodDeclaration() {
        return methodDeclaration;
    }

    public void setMethodDeclaration(MethodDeclaration methodDeclaration) {
        this.methodDeclaration = methodDeclaration;
    }

    @Override
    public String toString() {
        if(propertyDeclaration==null){
            return "\nInterfaceMember{" +
                    ", \nmethodDeclaration=" + methodDeclaration +
                    "\n}";
        }
        if(methodDeclaration==null){
            return "\nInterfaceMember{" +
                    ", \npropertyDeclaration=" +propertyDeclaration +
                    "\n}";
        }

        return "InterfaceMember{" +
                "propertyDeclaration=" + propertyDeclaration +
                ", methodDeclaration=" + methodDeclaration +
                "\n}";
    }
}
