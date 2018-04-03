package equipment;

public class Spell {

    private String name;
    private int level;


    Spell(String spellName, int attaque) {
        this.name = spellName;
        this.level = attaque;

    }

    public String toString() {
        return "\n son Sort: " + this.name + "\n niveau du Sort: " + this.level;

    }
}
