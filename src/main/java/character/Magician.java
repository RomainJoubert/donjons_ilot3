package character;

import box.AddPhilter;
import equipment.Spell;

public class Magician extends Character {
	private Spell spell;

	private AddPhilter philter;

    public Spell getSpell() {
        return spell;
    }

    public void setSpell(Spell spell) {
        this.spell = spell;
    }

    public AddPhilter getPhilter() {
        return philter;
    }

    public void setPhilter(AddPhilter philter) {
        this.philter = philter;
    }

    public String toString() {
        return super.toString() + "\nSort : " + spell + "\nPhiltre : " + philter;
    }
}
