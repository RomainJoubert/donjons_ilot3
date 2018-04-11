package box;

import game.Board;

public class AddSpell implements Surprise {
    private String spellName;
    private int spellLevel;

    public AddSpell(String spellName, int spellLevel) {
        this.spellName = spellName;
        this.spellLevel = spellLevel;
    }

    public String getSpellName() {
        return spellName;
    }

    public void setSpellName(String spellName) {
        this.spellName = spellName;
    }

    public int getSpellLevel() {
        return spellLevel;
    }

    public void setSpellLevel(int spellLevel) {
        this.spellLevel = spellLevel;
    }

    @Override
    public void faireAction(Board b, character.Character c) {

    }

    @Override
    public String toString() {
        return ", tu récupères le sort " + this.spellName + " d'une force d'attaque de " + spellLevel ;
    }
}
