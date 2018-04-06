package box;

public class addSpell extends Surprise {
    private String spellName;
    private int spellLevel;



    public addSpell(String spellName, int spellLevel) {
        this.spellName = spellName;
        this.spellLevel = spellLevel;
    }

    public int getSpellLevel() {
        return spellLevel;
    }

    public void setSpellLevel(int spellLevel) {
        this.spellLevel = spellLevel;
    }

    @Override
    public String toString() {
        return "Nouveau sort" + this.spellName + "\nNiveau du sort : " + spellLevel ;
    }
}
