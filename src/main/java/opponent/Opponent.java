package opponent;

import game.EventCase;

public class Opponent extends EventCase  {
    public int attackLevel;
    public String name;
    public int lifeLevelOpponent;
    
    public int getLifeLevelOpponent() {
        return lifeLevelOpponent;
    }

    public void setLifeLevelOpponent(int lifeLevelOpponent) {
        this.lifeLevelOpponent = lifeLevelOpponent;
    }

    public String toString() {
        return "\n son nom " + name;

    }
}
