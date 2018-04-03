package game;



public class Weapon {

    private String name;
    private int niveau;


    Weapon(String weaponName, int attaque) {
        this.name = weaponName;
        this.niveau = attaque;

    }

    public String toString() {
        return "\n son Arme: " + this.name + "\n niveau de l'arme: " + this.niveau;

    }
}