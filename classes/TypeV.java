package classes;

import java.util.List;

public class TypeV {
    String string_type  ;
    Double number_type ;
    ListV listV;

    public String getSTRING_TYPE() {
        return string_type ;
    }

    public void setSTRING_TYPE(String STRING_TYPE) {
        this.string_type  = STRING_TYPE;
    }

    public double getNumber_type() {
        return number_type;
    }

    public void setNumber_type(double number_type) {
        this.number_type = number_type;
    }

    public ListV getListV() {
        return listV;
    }

    public void setListV(ListV listV) {
        this.listV = listV;
    }

    @Override
    public String toString() {
        if(number_type!=null){
            return "\nTypeV{"+
                    "\n, number_type=" + number_type +
                    "\n}";
        }
        if(listV!=null){
            return "\nTypeV{"+
                    "\n,listV=" +listV +
                    "\n}";
        }
        return   "\nTypeV{"+
                "\n,string_type =" + string_type +
                "\n}";


    }}