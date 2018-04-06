package opponent;

public class Wizzard extends Opponent {
    public Wizzard(int attackLevel) {
        this.attackLevel = attackLevel;
    }

    public int getAttackLevel() {
        return attackLevel;
    }

    public void setAttackLevel(int attackLevel) {
        this.attackLevel = attackLevel;
    }

    public String toString() {
        return "\n son niveau d'attaque ;" +attackLevel ;


    }
// combattent les magiciens uniquement
}
