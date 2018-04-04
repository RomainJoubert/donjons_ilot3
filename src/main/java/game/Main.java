
package game;

import java.util.Random;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        showMenu();
        createcharacter();
        nombreAleatoire();

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
