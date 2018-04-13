package box;

import character.Warrior;
import equipment.Weapon;
import game.Board;

public class AddWeapon implements Surprise {
    private String weaponName;
    private int weaponLevel;
    Weapon w = new Weapon();

    public AddWeapon(String weaponName, int weaponLevel) {
        this.weaponName = weaponName;
        this.weaponLevel = weaponLevel;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public int getWeaponLevel() {
        return weaponLevel;
    }

    public void setWeaponLevel(int weaponLevel) {
        this.weaponLevel = weaponLevel;
    }

    @Override
    public String toString() {
        return ", tu récupères une arme " + weaponName + " d'une force d'attaque de " + weaponLevel;
    }

    @Override
    public void faireAction(Board b, character.Character perso) {
//        System.out.println( "personnage : " + perso);
//        ((Warrior) perso).setWeapon(w);
    }
}
