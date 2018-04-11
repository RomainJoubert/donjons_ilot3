package box;


import game.Board;

public class AddShield implements Surprise {
    private int shieldLevel;

    public AddShield(int shieldLevel) {
        this.shieldLevel = shieldLevel;
    }

    public int getShieldLevel() {
        return shieldLevel;
    }

    public void setShieldLevel(int shieldLevel) {
        this.shieldLevel = shieldLevel;
    }

    @Override
    public void faireAction(Board b, character.Character c) {

    }

    @Override
    public String toString() {
        return "Niveau de protection du bouclier gagné : " + this.shieldLevel;
    }
}
