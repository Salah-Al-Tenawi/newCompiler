package classes;

public class ClassDeclaration {
    String nameClass;

    public ClassDeclarationBody getClassDeclarationBody() {
        return classDeclarationBody;
    }

    public void setClassDeclarationBody(ClassDeclarationBody classDeclarationBody) {
        this.classDeclarationBody = classDeclarationBody;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    ClassDeclarationBody
            classDeclarationBody ;

    @Override
    public String toString() {
        return "\nClassDeclaration{" +
                "\nnameClass='" + nameClass + '\'' +
                ", \nclassDeclarationBody=" + classDeclarationBody +
                "\n}";
    }
}
