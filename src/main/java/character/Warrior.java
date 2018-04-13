package character;

import box.AddShield;
import equipment.Weapon;

public class Warrior extends Character {
    private Weapon weapon;
    private AddShield shield;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public AddShield getShield() {
        return shield;
    }

    public void setShield(AddShield shield) {
        this.shield = shield;
    }

    public String toString() {
        return super.toString() + "\nArme : " + weapon + "\nBouclier : " + shield;

    }
}
