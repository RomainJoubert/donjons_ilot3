package equipment;

public class Ligthning extends Spell{
    private int lightLevel;

    public Ligthning(String name, int lightLevel) {
        this.name = name;
        this.lightLevel = lightLevel;
    }

    public int getLightLevel() {
        return lightLevel;
    }

    public void setLightLevel(int lightLevel) {
        this.lightLevel = lightLevel;
    }

    @Override
    public String toString() {
        return super.toString() + " de force d'attaque " + lightLevel;
    }
}
