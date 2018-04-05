package game;

import java.util.Random;


public class Dice {
    private int n;

    public int getN() {
        return n;
    }

    public void randomNumber() {
        Random r = new Random(); //utiliser le tirage aléatoire via la classe random
        n = r.nextInt(6) + 1; //permet un tirage entre 0 et 5, on y ajoute +1 pour ne pas tomber sur 0 et obtenir 6

    }
}
