package game;



public class Weapon {

    private String name;
    private int level;

    Weapon(String weaponName, int attaque) {
        this.name = weaponName;
        this.level = attaque;

    }

    public String toString() {
        return "\n son Arme: " + this.name + "\n niveau de l'arme: " + this.level;

    }
}