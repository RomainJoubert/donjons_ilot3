package equipment;


public class Weapon {
    public String name;
    public int damagesDragons;
    public int damagesSuccubus;

    public Weapon(String weaponName, int damagesDragons, int damagesSuccubus) {
        this.name = weaponName; // recupère la saisie utilisateur
        this.damagesDragons = damagesDragons;
        this.damagesSuccubus = damagesSuccubus;


    }

    public String toString() {
        return "\n son Arme: " + this.name + "\n niveau de l'arme contre dragons/succubes/wizzard: " + this.damagesDragons + this.damagesSuccubus;

    }
}