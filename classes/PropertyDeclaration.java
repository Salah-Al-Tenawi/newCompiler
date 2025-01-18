package classes;

import java.lang.reflect.Type;

public class PropertyDeclaration {
    String id ;
    TypeV typeV ;
    Initvalue initvalue;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TypeV getTypeV() {
        return typeV;
    }

    public void setTypeV(TypeV typeV) {
        this.typeV = typeV;
    }

    public Initvalue getInitvalue() {
        return initvalue;
    }

    public void setInitvalue(Initvalue initvalue) {
        this.initvalue = initvalue;
    }

    @Override
    public String toString() {
        return "\nPropertyDeclaration{" +
                "id='" + id + '\'' +
                ", typeV=" + typeV +
                ", initvalue=" + initvalue +
                '}';
    }
}
