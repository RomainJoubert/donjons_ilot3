package box;

import game.Board;

public class Joker50 implements Surprise{

    @Override
    public void faireAction(Board b, character.Character c) {
       c.setLife(c.getLife() + 50);
    }
}
