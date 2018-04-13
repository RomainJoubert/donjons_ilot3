package opponent;

import box.Surprise;
import game.Board;

public class Dragon extends Opponent implements Surprise  {
// combattent guerriers et magiciens. Plus ils sont vieux et plus leur force d'attaque est élevée.
    private int age;
    private int dragonLevel;

	public Dragon(int dragonAge , int dragonLevel) {
        this.age = dragonAge;
        this.dragonLevel = dragonLevel;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int dragonAge) {
        this.age = dragonAge;
    }

    public String toString() {
        return "Dragon âgé de "+ age + " son niveau d'attaque : " + dragonLevel;
    }

    @Override
    public void faireAction(Board b, character.Character c) {

    }
}
