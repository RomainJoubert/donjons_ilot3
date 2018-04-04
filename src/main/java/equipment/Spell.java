package equipment;

import character.Magician;

public class Spell extends Magician {

    private String name;
    private int level;


    Spell(String spellName, int dragonAttack , int succubusAttack, int wizzardAttack) {
        this.name = spellName;
        this.levelDragons = dragonAttack;
        this.levelSuccubus = succubusAttack;
        this.levelWizzard = wizzardAttack;

    }

    public String toString() {
        return "\n son Sort: " + this.name + "\n niveau du Sort: " + this.level;

    }
}