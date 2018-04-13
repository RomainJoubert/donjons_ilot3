package box;

import character.Magician;
import equipment.Spell;
import game.Board;

public class AddSpell implements Surprise {
    private String spellName;
    private int spellLevel;
    Spell s = new Spell();

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
    public String toString() {
        return ", tu récupères le sort " + this.spellName + " d'une force d'attaque de " + spellLevel ;
    }

    @Override
    public void faireAction(Board b, character.Character perso) {
        System.out.println( "personnage : " + perso);
        ((Magician) perso).setSpell(s);
    }
}
