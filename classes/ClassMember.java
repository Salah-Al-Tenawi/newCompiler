package classes;

public class ClassMember {
    PropertyDeclaration propertyDeclaration;
    MethodDeclaration methodDeclaration ;

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
        if(propertyDeclaration==null)
            return  "\n ClassMember{"+
                    "\n methodDeclaration=" + methodDeclaration +
                    "\n}";
        else if (methodDeclaration==null)
            return "\n ClassMember{"+
                    "\n propertyDeclaration=" + propertyDeclaration +
                     "\n}";

        return "\nClassMember{" +
                "\npropertyDeclaration=" + propertyDeclaration +
                "\n methodDeclaration=" + methodDeclaration +
                "\n}";
    }
}
