package character;

public class Magician extends Character {
	private String spell;
    private int spellLevel;
    private String potion;
    private int potionLevel;

    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
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
