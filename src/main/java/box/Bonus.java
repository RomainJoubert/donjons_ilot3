package box;

import game.Board;

public class Bonus implements Surprise{

    public String toString() {
        return "Bonus, tu avances de 5 cases";
    }

    @Override
    public void faireAction(Board b, character.Character c) {
        b.setCases(b.getCases() + 5);

    }
}
