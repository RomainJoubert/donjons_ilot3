package game;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        showMenu();
        createcharacter();
        nombreAleatoire();

        ArrayList <Weapon> weaponList = new ArrayList<Weapon>();
        weaponList.add(w1 = new Weapon("Arc", 50,25));
        weaponList.add(w2 = new Weapon ("Massue", 30,30,30));
        weaponList.add(w3 = new Weapon("Epée", 25,25,25));

        ArrayList <Spell> spellList = new ArrayList<Spell>();
        spellList.add(s1 = new Spell("Eclair", 25,0,50));
        spellList.add(s2 = new Spell("Invisibilité", 30,30,30));
        spellList.add(s3 = new Spell("Mur de feu", 25,25,25));

    }


    public static void showMenu() {
        System.out.println("Choisis un personnage \n 1-Guerrier \n 2-Magicien");
        sc.nextInt();
        sc.nextLine();
    }




    public static void createcharacter() {
        System.out.println("Entre le nom de ton personnage");
        String nameChoice = sc.nextLine();
        System.out.println("Ajoute une image");
        String pictureChoice = sc.nextLine();
        System.out.println("Ton personnage porte le nom de " + nameChoice + " et a l'image : " + pictureChoice);
    }

    public static int nombreAleatoire() {
        System.out.println("lancer le dé ? \n1- oui \n2-non");
        int nb = sc.nextInt();
        sc.nextLine();
        int n = 0;
        if (nb == 1) {
            Random r = new Random(); // classe pour pouvoir utiliser le tirage aléatoire
            n = r.nextInt(6) + 1; //permet un tirage entre 0 et 5, on y ajoute un pour ne pas tomber sur 0 et avoir 6
            System.out.println(n);
        } else {
            System.out.println("hasta luego");
        }return n;
    }
}
