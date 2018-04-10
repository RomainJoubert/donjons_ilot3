package equipment;

import character.Magician;

public class Spell extends Magician {
    public String name;
    public int levelDragons;
    public int levelWizzard;

    public Spell(String spellName, int dragonAttack, int wizzardAttack) {
        this.name = spellName;
        this.levelDragons = dragonAttack;
        this.levelWizzard = wizzardAttack;

    }

    public String toString() {
        return "\n son Sort: " + this.name + "\n niveau du Sort: " + this.levelDragons + this.levelWizzard;


    }
}
