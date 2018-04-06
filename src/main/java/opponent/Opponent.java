package opponent;

public class Opponent {

    public int attackLevel;
    public String name;


    public int getAttackLevel() {
        return attackLevel;
    }

    public void setAttackLevel(int attackLevel) {
        this.attackLevel = attackLevel;
    }

    public String toString() {
        return "\n son niveau d'attaque ;" +attackLevel ;


    }
}
