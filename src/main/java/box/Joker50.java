package box;

import game.Board;

public class Joker50 implements Surprise{

    public String toString() {
        return "Joker, tu gagnes 50 points de vie";
    }

    @Override
    public void faireAction(Board b, character.Character c) {
       c.setLife(c.getLife() + 50);
    }
}
