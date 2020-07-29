package Task2;

import java.util.Iterator;

public class Animal {
    private String type;
    private String name;

    public Animal(){};
    public Animal (String type, String name){
        this.type = type;
        this.name = name;
    }

    public String getName(){ return name; }
    public void setName(String name){ this.name = name; }

    public String getType(){ return type; }
    public void setType(String type){ this.type = type; }

    @Override
    public String toString() {
        return name + " the " + type;
    }

    public boolean hasInside(String name, String type){
        boolean temp = false;
        if (this.name.equalsIgnoreCase(name)){
            if (this.type.equalsIgnoreCase(type)){temp = true;}
        }
        else temp = false;
        return temp;
    }

}
