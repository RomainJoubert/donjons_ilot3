package opponent;

import box.Surprise;
import game.Board;

public class Succubi implements Surprise {
    // combattent les guerriers - divise la force des armes des guerriers par deux
    private int succubiLevel;
    private String name;


    public Succubi(String name, int succubiLevel) {
        this.succubiLevel = succubiLevel;
        this.name = name;

    }

    public int getSuccubiLevel() {
        return succubiLevel;
    }

    public void setSuccubiLevel(int attackLevel) {
        this.succubiLevel = succubiLevel;
    }

    public String toString() {
        return "Succube, son nom est : "+ name +" son niveau d'attaque : " + succubiLevel;


    }

    @Override
    public void faireAction(Board b, character.Character c) {

    }
}
