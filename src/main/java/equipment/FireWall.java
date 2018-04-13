package equipment;

public class FireWall extends Spell {
    private int fireLevel;

    public FireWall(String fireName, int fireLevel) {
        this.name = fireName;
        this.fireLevel = fireLevel;
    }

    public int getFireLevel() {
        return fireLevel;
    }

    public void setFireLevel(int fireLevel) {
        this.fireLevel = fireLevel;
    }

    @Override
    public String toString() {
        return super.toString() + " de force d'attaque de " + fireLevel;
    }
}
