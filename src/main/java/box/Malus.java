package box;

import character.Character;
import game.Board;

public class Malus implements Surprise {

    @Override
    public String toString() {
        return "Malus, tu recules de 5 cases";
    }

    @Override
    public void faireAction(Board b, Character c) {
        b.setTabCases(b.getTabCases());
    }
}