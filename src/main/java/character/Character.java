package character;

public class Character {
    private String name;
    private String chType;
    private String picture;
    private int life = 100;
    private int strengthCharacter =15;


   /* public Character(String name, String picture,int life, int attackLevel) {
        this.name = name;
        this.picture = picture;
        this.life = life;
        this.attackLevel = attackLevel;
    }*/


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChType() {
        return chType;
    }

    public void setChType(String chType) {
        this.chType = chType;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getStrengthCharacter() {

        return strengthCharacter;
    }

    public void setStrengthCharacter(int attackLevel) {
        this.strengthCharacter = attackLevel;
    }

    public String toString() {
        return "détails du personnage" + "\nType" + chType + "\nnom : " + name + "\nimage : " + picture + "\nvie : " + life + "\nForce d'attaque : " + strengthCharacter;
    }
}
