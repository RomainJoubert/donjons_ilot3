package character;

import equipment.Spell;

public class Magician extends Character {
	private Spell spell;
    private int spellLevel;
    private String potion;
    private int potionLevel;

    public Spell getSpell() {
        return spell;
    }

    public void setSpell(Spell spell) {
        this.spell = spell;
    }

    public int getSpellLevel() {
        return spellLevel;
    }

    public void setSpellLevel(int spellLevel) {
        this.spellLevel = spellLevel;
    }

    public String getPotion() {
        return potion;
    }

    public void setPotion(String potion) {
        this.potion = potion;
    }

    public int getPotionLevel() {
        return potionLevel;
    }

    public void setPotionLevel(int potionLevel) {
        this.potionLevel = potionLevel;
    }

    public String toString() {
        return "Sort : " + spell +
                "\nPuissance du sort : " + spellLevel +
                "\nPhiltre : " + potion +
                "\nPuissance du philtre : " + potionLevel;
    }
}
