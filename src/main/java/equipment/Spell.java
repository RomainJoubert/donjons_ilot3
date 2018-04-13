package equipment;


public class Spell extends Equipment {
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "\n son Sort: " + this.name ;


    }
}
