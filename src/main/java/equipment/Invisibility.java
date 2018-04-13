package equipment;

public class Invisibility extends Spell {
    private int invisibilityLevel;

    public Invisibility(String name, int invisibilityLevel) {
        this.invisibilityLevel = invisibilityLevel;
        this.name = name;
    }

    public int getInvisibilityLevel() {
        return invisibilityLevel;
    }

    public void setInvisibilityLevel(int invisibilityLevel) {
        this.invisibilityLevel = invisibilityLevel;
    }

    @Override
    public String toString() {
        return super.toString() + " de force d'attaque de " + invisibilityLevel;
    }
}
