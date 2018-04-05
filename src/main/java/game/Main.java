package game;

import character.Character;
import equipment.Weapon;
import equipment.Spell;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    Character chara;
    String nameChoice;

    public static void main(String[] args) {
        showMenu();
        //chooseEquipment();
        createCharacter();
        moveCase();
        playAgain();


        ArrayList<Weapon> weaponList = new ArrayList<Weapon>();
        Weapon w1 = new Weapon("Arc", 50, 25, 0);
        weaponList.add(w1);
        Weapon w2 = new Weapon("Massue", 30, 30, 30);
        weaponList.add(w2);
        Weapon w3 = new Weapon("Epée", 25, 25, 25);
        weaponList.add(w3);


        ArrayList<Spell> spellList = new ArrayList<Spell>();
        Spell s1 = new Spell("Eclair", 25, 0, 50);
        spellList.add(s1);
        Spell s2 = new Spell("Invisibilité", 30, 30, 30);
        spellList.add(s2);
        Spell s3 = new Spell("Mur de feu", 25, 25, 25);
        spellList.add(s3);

    }


   /* public static void chooseEquipment(){

        if(chType.equals("Magicien")) {
            chara.setChType("magician");
        }else if(chType.equals("Guerrier")) {
            chara.setChType("guerrier");
        }else{
            System.out.println("ERROR character type");
            }

            System.out.println(chType);
        }*/


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
        int nb;
        do {
            System.out.println("Lancer le dé ? \n1-oui \n2-non");
            nb = sc.nextInt();
            sc.nextLine();
            if (nb == 1) {
                Dice dice1 = new Dice();
                dice1.randomNumber();
                System.out.println("Tu as fait : " + dice1.getN());
                cases = cases + dice1.getN();
<<<<<<< HEAD
                System.out.println("Tu es à la case : " + cases);
=======
                System.out.println("Tu es à la case : " + cases + "/64");
>>>>>>> 1e771a87d464f4d1a87e00b5143d6c0e3a20edb7
            } else {
                exit = true;
                System.out.println("exit");
            }
        } while (cases < 64 && !exit);
    }

    //    méthode pour relancer une partie
    public static void playAgain() {
        int test;
        System.out.println(" \nUne autre partie? \n 1 - Oui \n 2 - Non");
        test = sc.nextInt();
        while (test == 1) {
            moveCase();
            System.out.println(" \nUne autre partie? \n 1 - Oui \n 2 - Non");
            test = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("A bientôt !");
    }
}



