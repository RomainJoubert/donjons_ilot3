package game;


import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        showMenu();
        createCharacter();
        moveCase();

        ArrayList <Weapon> weaponList = new ArrayList<Weapon>();
        weaponList.add(new Weapon("Arc", 50,25));
        weaponList.add(new Weapon ("Massue", 30,30,30));
        weaponList.add(new Weapon("Epée", 25,25,25));

        ArrayList <Spell> spellList = new ArrayList<Spell>();
        spellList.add(new Spell("Eclair", 25,0,50));
        spellList.add(new Spell("Invisibilité", 30,30,30));
        spellList.add(new Spell("Mur de feu", 25,25,25));

    }

    public static void showMenu() {
        System.out.println("Choisis un personnage \n1-Guerrier \n2-Magicien");
        sc.nextInt();
        sc.nextLine();
    }


    public static void createCharacter() {
        System.out.println("Entre le nom de ton personnage");
        String nameChoice = sc.nextLine();
        System.out.println("Ajoute une image");
        String pictureChoice = sc.nextLine();
        System.out.println("Ton personnage porte le nom de " + nameChoice + " et a l'image : " + pictureChoice);
    }

    //-------------------méthode pour se déplacer sur le plateau-----------------------
    public static void moveCase() {
        int cases = 0;
        boolean exit = false;
        do {
            System.out.println("lancer le dé ? \n1-oui \n2-non");
            int nb = sc.nextInt();
            sc.nextLine();
            if (nb == 1) {
                Dice dice1 = new Dice();
                dice1.randomNumber();
                System.out.println("vous avez fait : " + dice1.getN());
                cases = cases + dice1.getN();
                System.out.println("Vous êtes à la case : " + cases);
            } else {
                exit = true;
                System.out.println("exit");
            }

        } while (cases < 64 && !exit);


    }
}


