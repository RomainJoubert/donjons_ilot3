package opponent;

import game.event;

public class Opponent extends event {

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
