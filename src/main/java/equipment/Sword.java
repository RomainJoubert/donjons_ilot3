package equipment;

public class Sword extends Weapon {
    private int swordLevel;

    public Sword(String name, int swordLevel) {
        this.name = name;
        this.swordLevel = swordLevel;
    }

    public int getSwordLevel() {
        return swordLevel;
    }

    public void setSwordLevel(int swordLevel) {
        this.swordLevel = swordLevel;
    }

    @Override
    public String toString() {
        return "Sword{" +
                "swordLevel=" + swordLevel +
                '}';
    }
}
