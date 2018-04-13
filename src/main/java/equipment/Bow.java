package equipment;

public class Bow  extends Weapon{

    private int bowLevel;

    public int getBowLevel() {
        return bowLevel;
    }

    public Bow(String name, int bowLevel) {
        this.name = name;
        this.bowLevel = bowLevel;
    }

    public void setBowLevel(int bowLevel) {
        this.bowLevel = bowLevel;
    }

    @Override
    public String toString() {
        return super.toString() + " de force d'attaque de  " + bowLevel ;
    }
}
