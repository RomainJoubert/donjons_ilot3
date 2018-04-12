package opponent;

public class Opponent {
    private String name;
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
