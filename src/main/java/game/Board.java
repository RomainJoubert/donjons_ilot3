package main.java.game;
import java.util.Random;

public class Board {

    public static int nombreAleatoire(){
            Random r = new Random();
            int n = r.nextInt(6);
            return n;

    }

}
