package box;

import game.Board;

public class AddPhilter implements Surprise {
    private int philterLevel;

    public AddPhilter(int philterLevel) {
        this.philterLevel = philterLevel;
    }

    public int getPhilterLevel() {
        return philterLevel;
    }

    public void setPhilterLevel(int philterLevel) {
        this.philterLevel = philterLevel;
    }

    @Override
    public void faireAction(Board b, character.Character c) {

    }

    @Override
    public String toString() {
        return ", tu récupères un philtre de niveau " + philterLevel;
    }
}
