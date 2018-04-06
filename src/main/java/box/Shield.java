package box;

public class Shield extends Surprise {
    private int shieldLevel;


    public Shield(int shieldLevel) {

        this.shieldLevel = shieldLevel;
    }

    public int getShieldLevel() {
        return shieldLevel;
    }

    public void setShieldLevel(int shieldLevel) {
        this.shieldLevel = shieldLevel;
    }

    @Override
    public String toString() {
        return "Niveau de protection du bouclier gagné : " + this.shieldLevel;
    }
}
