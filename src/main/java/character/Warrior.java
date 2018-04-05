package character;

public class Warrior extends Character {
    private String weapon;
    private int weaponLevel;
    private String shield;
    private int shieldLevel;

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getWeaponLevel() {
        return weaponLevel;
    }

    public void setWeaponLevel(int weaponLevel) {
        this.weaponLevel = weaponLevel;
    }

    public String getShield() {
        return shield;
    }

    public void setShield(String shield) {
        this.shield = shield;
    }

    public int getShieldLevel() {
        return shieldLevel;
    }

    public void setShieldLevel(int shieldLevel) {
        this.shieldLevel = shieldLevel;
    }

    public String toString() {
        return "Arme : " + weapon +
                "\n Puissance de l'arme : " +weaponLevel +
                "\n Bouclier : " + shield +
                "\n Puissance du bouclier : " + shieldLevel;
    }
}
