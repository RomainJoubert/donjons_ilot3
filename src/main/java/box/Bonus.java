package box;

import game.Board;

public class Bonus implements Surprise{


    @Override
    public void faireAction(Board b, character.Character c) {
        b.setCases(b.getCases() + 5);

    }
}
