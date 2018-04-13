package character;

public abstract class Character {
    private String name;
    private String picture;
    private int life;
    private int strengthCharacter;
    private int caseNum;

    public int getCaseNum() {
        return caseNum;
    }

    public void setCaseNum(int caseNum) {
        this.caseNum = caseNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return "détails du personnage" + "\nnom : " + name + "\nimage : " + picture + "\nvie : " + life + "\nForce d'attaque : " + strengthCharacter;
    }


}
