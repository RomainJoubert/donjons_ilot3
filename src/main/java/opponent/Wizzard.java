package opponent;

import box.Surprise;
import character.Character;
import game.Board;

public class Wizzard implements Surprise {
	private int wizzardLevel;

    public Wizzard(int wizzardLevel) {
        this.wizzardLevel = wizzardLevel;
    }

    public int getWizzardLevel() {
        return wizzardLevel;
    }

    public void setWizzardLevel(int wizzardLevel) {
        this.wizzardLevel = wizzardLevel;
    }

    public String toString() {
        return "wizzard, son niveau d'attaque : " + wizzardLevel;

    }

    @Override
    public void faireAction(Board b, Character c) {

    }

    // combattent les magiciens uniquement
}
