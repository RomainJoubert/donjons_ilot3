package game;

import box.AddWeapon;
import box.Bonus;
import box.Shield;
import box.SurpriseCase;
import character.Character;
import equipment.Weapon;
import equipment.Spell;
import opponent.Opponent;
import opponent.Dragon;
import opponent.Wizzard;
import opponent.Succubi;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    static String charaGetType;

    public static void main(String[] args) {

        ArrayList<Weapon> weaponList = new ArrayList<Weapon>();
        Weapon w1 = new Weapon("Arc", 50, 25, 0);
        weaponList.add(w1);
        Weapon w2 = new Weapon("Massue", 30, 30, 30);
        weaponList.add(w2);
        Weapon w3 = new Weapon("Epée", 25, 25, 25);
        weaponList.add(w3);

        //------------------liste des sorts-----------------------------------
        ArrayList<Spell> spellList = new ArrayList<Spell>();
        Spell s1 = new Spell("Eclair", 25, 0, 50);
        spellList.add(s1);
        Spell s2 = new Spell("Invisibilité", 30, 30, 30);
        spellList.add(s2);
        Spell s3 = new Spell("Mur de feu", 25, 25, 25);
        spellList.add(s3);

        ArrayList<Dragon> dragonList = new ArrayList<Dragon>();
        Dragon d1 = new Dragon(80, 80);
        dragonList.add(d1);
        Dragon d2 = new Dragon(60, 60);
        dragonList.add(d2);
        Dragon d3 = new Dragon(40, 40);
        dragonList.add(d3);
        Dragon d4 = new Dragon(30, 30);
        dragonList.add(d4);
        Dragon d5 = new Dragon(20, 20);
        dragonList.add(d5);
        Dragon d6 = new Dragon(15, 15);
        dragonList.add(d6);

        ArrayList<Wizzard> wizzardList = new ArrayList<Wizzard>();
        Wizzard wz1 = new Wizzard(75);
        wizzardList.add(wz1);
        Wizzard wz2 = new Wizzard(50);
        wizzardList.add(wz2);
        Wizzard wz3 = new Wizzard(25);
        wizzardList.add(wz3);
        Wizzard wz4 = new Wizzard(15);
        wizzardList.add(wz4);

        ArrayList<Succubi> succubiList = new ArrayList<Succubi>();
        Succubi suc1 = new Succubi(75);
        succubiList.add(suc1);
        Succubi suc2 = new Succubi(50);
        succubiList.add(suc2);
        Succubi suc3 = new Succubi(25);
        succubiList.add(suc3);
        Succubi suc4 = new Succubi(15);
        succubiList.add(suc4);

//-----------------jeu-----------------------------------------
        showMenu();
        createCharacter();
        chooseEquipment(weaponList, spellList);
        attributeNumberCaseToOpponent();
        moveCase();
        shieldSurprise();
    }


    public static void attributeNumberCaseToOpponent() {
        int cases[] = new int[65]; //tableau de cases, de 0 à 65.

        for (int i = 1; i < cases.length; i++) {
            Random rn = new Random(i);
            int currentCase = rn.nextInt(i) + 1;
            System.out.println(currentCase);
        }
    }
    //--------------méthode qui affiche le menu-------------------
    public static void showMenu() {
        // String chType;
        int test;
        String input;
        do {
            System.out.println("Choisis un personnage \n1-Guerrier \n2-Magicien");
            input = sc.nextLine();
            try {
                test = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.printf("\"%s\" n'est pas valide.\n", input);
            }
        } while (!(input.equals("1") || input.equals("2")));
        if (input.equals("1")) {
            charaGetType = "Guerrier";
        } else if (input.equals("2")) {
            charaGetType = "Magicien";
        }
    }

    //--------------méthode pour créer un personnage-------------------
    public static void createCharacter() {
        System.out.println("Entre le nom de ton personnage");
        String nameChoice = sc.nextLine();
        System.out.println("Ajoute une image");
        String pictureChoice = sc.nextLine();
        System.out.println("Ton personnage porte le nom de " + nameChoice + " et a l'image : " + pictureChoice);
    }

    //--------------méthode pour choisir armes ou sorts---------------------
    public static void chooseEquipment(ArrayList<Weapon> weaponList, ArrayList<Spell> spellList) {
        //String charaGetType = "Magicien"; juste pour tester tant que les perso ne sont pas stockés, à enlever ensuite.

        if (charaGetType.equals("Guerrier")) { //remplacer par chara.getType (chara sera un objet de type Characater et servira à récupérer un personnage crée)
            for (int i = 0; i < weaponList.size(); i++) {
                System.out.println(i + " - " + weaponList.get(i).name);
            }

        } else if (charaGetType.equals("Magicien")) {
            for (int j = 0; j < spellList.size(); j++) {
                System.out.println(j + " - " + spellList.get(j).name);
            }
        }
    }

    //-------------------méthode pour se déplacer sur le plateau-----------------------
    public static int moveCase() {
        int cases = 0;
        boolean exit = false;
        int nb;
        String input2;

        do {
            do {
                System.out.println("Lancer le dé ? \n1-oui \n2-non");
                input2 = sc.nextLine();
                try {
                    nb = Integer.parseInt(input2);
                } catch (NumberFormatException e) {
                    System.out.printf("\"%s\" n'est pas valide.\n", input2);
                }
            } while (!(input2.equals("1") || input2.equals("2")));
            if (input2.equals("1")) {
                Dice dice1 = new Dice();
                dice1.randomNumber();
                System.out.println("Tu as fait : " + dice1.getN());
                cases = cases + dice1.getN();
                System.out.println("Tu es à la case : " + cases + "/64");

            } else if (input2.equals("2")) {
                exit = true;
                System.out.println("Tu es sorti(e) du game !");
            }
        } while (cases < 10 && !exit);
        playAgain();
        return cases;
    }

    //-----------------méthode pour relancer une partie--------------------
    public static void playAgain() {
        int test;
        String choix;
        do {
            System.out.println(" \nUne autre partie? \n 1 - Oui \n 2 - Non");
            choix = sc.nextLine();
            try {
                test = Integer.parseInt(choix);
            } catch (NumberFormatException e) {
                System.out.printf("\"%s\" n'est pas valide.\n", choix);
            }
        } while (!(choix.equals("1") || choix.equals("2")));
        if (choix.equals("1")) {
            moveCase();
        } else if (choix.equals("2")) {
            System.out.println("A bientôt !");
        }
    }

    //-----------------caisse surprise arme----------------------
    public static void weaponSurprise() {
        int i;
        ArrayList<SurpriseCase> addWeaponArrayList = new ArrayList<SurpriseCase>();
        SurpriseCase s4 = new SurpriseCase(new AddWeapon("bombe", 100));
        addWeaponArrayList.add(s4);
        SurpriseCase s5 = new SurpriseCase(new AddWeapon("hache", 25));
        addWeaponArrayList.add(s5);
        for (i = 0; i < addWeaponArrayList.size(); i++) {
            System.out.println(addWeaponArrayList.get(i));
        }
    }

    //----------------caisse surprise bouclier---------------
    public static void shieldSurprise() {
        ArrayList<SurpriseCase> addShieldList = new ArrayList<SurpriseCase>();
        SurpriseCase sh1 = new SurpriseCase(new Shield(5));
        addShieldList.add(sh1);
        SurpriseCase sh2 = new SurpriseCase(new Shield(3));
        addShieldList.add(sh2);
        SurpriseCase sh3 = new SurpriseCase(new Shield(2));
        addShieldList.add(sh3);
        System.out.println(sh1 + "\n" + sh2 + "\n" + sh3);

    }
}



