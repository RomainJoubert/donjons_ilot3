package box;

import character.Character;
import game.Board;

public class Joker25 implements Surprise {

    public String toString() {
        return "Joker, tu gagnes 25 points de vie";
    }

//    @Override
//    public void faireAction(Board b, character.Character c) {
//            c.setLife(c.getLife() + 25);
//        }

    @Override
    public void faireAction(Board b, character.Character c) {

    }
}

