package game;

import java.util.Random;

public class Board {

    private int ennemy;
    private int box;
    private int nb;

    public void distribution() {
        Random r = new Random(); //tirage aléatoire en utilisant la class Random
        nb = r.nextInt();
    }

    public int getEnnemy() {
        return ennemy;
    }

    public void setEnnemy(int ennemy) {
        this.ennemy = ennemy;
    }

    public int getBox() {
        return box;
    }

    public void setBox(int box) {
        this.box = box;
    }
}
