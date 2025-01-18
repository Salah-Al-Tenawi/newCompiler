package classes;

import java.util.ArrayList;
import java.util.List;

public class InterfaceDeclaration {
    List<InterfaceMember>interfaceMembers =new ArrayList<>();

    public List<InterfaceMember> getInterfaceMembers() {
        return interfaceMembers;
    }

    public void setInterfaceMembers(List<InterfaceMember> interfaceMembers) {
        this.interfaceMembers = interfaceMembers;
    }

    @Override
    public String toString() {
        return "\nInterfaceDeclaration{" +
                "\ninterfaceMembers=" + interfaceMembers +
                "\n}";
    }
}
