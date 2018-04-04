package equipment;


import character.Warrior;

public class Weapon extends Warrior{
    private String name;
    private int levelDragons;
    private int levelSuccubus;
    private int levelWizzard;


   public Weapon(String weaponName, int dragonAttack , int succubusAttack, int wizzardAttack) {
        this.name = weaponName; // recupère la saisie utilisateur
        this.levelDragons = dragonAttack;
        this.levelSuccubus = succubusAttack;
        this.levelWizzard = wizzardAttack;

    }

    public String toString() {
        return "\n son Arme: " + this.name + "\n niveau de l'arme: " ;

    }
}