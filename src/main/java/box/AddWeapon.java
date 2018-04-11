package box;

import character.Warrior;
import equipment.Weapon;
import game.Board;

import java.util.ArrayList;

public class AddWeapon implements Surprise {
    private String weaponName;
    private int weaponLevel;

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

    /**
     * Cette methode sert à executer l'action qui consiste à demandeer à l'utilisateur s'il veux changer d'arme
     *
     * @param b : le plateu de jeu
     * @param c : le personnage
     */
    @Override
    public void faireAction(Board b, character.Character c) {

        //chercherArme
        Weapon w = null;//=.....
        //si warrior proposition changer arme
        //si oui
        ((Warrior) c).setWeapon(w);
    }
}
