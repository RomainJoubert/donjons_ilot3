package box;

import game.Board;

public class Joker25 implements Surprise {

    @Override
    public void faireAction(Board b, character.Character c) {
            c.setLife(c.getLife() + 25);
        }
    }

