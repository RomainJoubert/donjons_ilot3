package box;

import game.Board;

public class Malus implements Surprise{

    @Override
    public String toString() {
        return "Malus, tu recules de 5 cases";
    }

    @Override
    public void faireAction(Board b, character.Character c) {
        b.setCases(b.getCases()-5);
    }
}
