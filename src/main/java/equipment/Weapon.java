package equipment;


import character.Warrior;

import java.util.ArrayList;

public class Weapon extends Warrior{

    public String name;
    public int levelDragons;
    public int levelSuccubus;
    public int levelWizzard;



    public Weapon(String weaponName, int dragonAttack , int succubusAttack, int wizzardAttack) {
        this.name = weaponName; // recupère la saisie utilisateur
        this.levelDragons = dragonAttack;
        this.levelSuccubus = succubusAttack;
        this.levelWizzard = wizzardAttack;

    }

    public String toString() {
        return "\n son Arme: " + this.name + "\n niveau de l'arme contre dragons/succubes/wizzard: " + this.levelDragons +this.levelSuccubus +this.levelWizzard;

    }
}