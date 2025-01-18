package classes;

import java.util.ArrayList;
import java.util.List;

public class Template {
    List<Element> element =new ArrayList();

    public List getElement() {
        return element;
    }

    public void setElement(List element) {
        this.element = element;
    }

    @Override
    public String toString() {
        if(element!=null && !element.isEmpty()){

            return "\nTemplate{" +
                    "\nelement=" + element +
                    "\n}";
        }
     return  "null";
    }
}
