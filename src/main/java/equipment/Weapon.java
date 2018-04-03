package game;



public class Weapon {

    private String name;
    private int niveau;


    public String Arme(String armeName, int attaque) {
        this.name = armeName;
        this.niveau = attaque;
return armeName;
    }

    public String toString() {
        return "\n son Arme: " + this.name + "\n niveau de l'arme: " + this.niveau;

    }
}