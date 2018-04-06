package box;

public class addShield extends Surprise {
    private int shieldLevel;


    public addShield(int shieldLevel) {

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
