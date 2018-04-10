package opponent;

public class Opponent {
    public int attackLevel;
    public String name;
    public int lifeLevelOpponent = 20;

    public int getLifeLevelOpponent() {
        return lifeLevelOpponent;
    }

    public void setLifeLevelOpponent(int lifeLevelOpponent) {
        this.lifeLevelOpponent = lifeLevelOpponent;
    }

    public int getAttackLevel() {
        return attackLevel;
    }

    public void setAttackLevel(int attackLevel) {
        this.attackLevel = attackLevel;
    }

    public String toString() {
        return "\n son niveau d'attaque ;" + attackLevel;


    }
}
