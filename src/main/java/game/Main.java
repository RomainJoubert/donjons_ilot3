package game;

import box.*;
import java.util.*;
import java.util.Map.Entry;

import box.AddWeapon;
import box.Bonus;
import box.addShield;
import box.SurpriseCase;
import character.Character;
import character.Warrior;
import character.Magician;
import equipment.Weapon;
import equipment.Spell;

import game.Board;


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
    static String classe;
    static Warrior X;
    static Magician Y;
    static Weapon w1 = new Weapon("Arc", 50, 25, 0);
    static Weapon w2 = new Weapon("Massue", 30, 30, 30);
    static Weapon w3 = new Weapon("Epée", 25, 25, 25);
    static Spell s1 = new Spell("Eclair", 25, 0, 50);
    static Spell s2 = new Spell("Invisibilité", 30, 30, 30);
    static Spell s3 = new Spell("Mur de feu", 25, 25, 25);
    static Dragon d1 = new Dragon(80, 80);
    static Dragon d2 = new Dragon(60, 60);
    static Dragon d3 = new Dragon(40, 40);
    static Dragon d4 = new Dragon(30, 30);
    static Dragon d5 = new Dragon(20, 20);
    static Dragon d6 = new Dragon(15, 15);
    static Wizzard wz1 = new Wizzard(75);
    static Wizzard wz2 = new Wizzard(50);
    static Wizzard wz3 = new Wizzard(25);
    static Wizzard wz4 = new Wizzard(15);
    static Succubi suc1 = new Succubi("Succube", 75);
    static Succubi suc2 = new Succubi("Succube", 50);
    static Succubi suc3 = new Succubi("Succube", 25);
    static Succubi suc4 = new Succubi("Succube", 15);
    static SurpriseCase s4 = new SurpriseCase(new AddWeapon("bombe", 100,20,20,20));
    static SurpriseCase s5 = new SurpriseCase(new AddWeapon("hache", 25,10,10,10));
    static SurpriseCase sp1 = new SurpriseCase(new addSpell("Boule de feu", 50));
    static SurpriseCase sp2 = new SurpriseCase(new addSpell("Lévitation", 25));
    static SurpriseCase sh1 = new SurpriseCase(new addShield(5));
    static SurpriseCase sh2 = new SurpriseCase(new addShield(3));
    static SurpriseCase sh3 = new SurpriseCase(new addShield(2));
    static SurpriseCase ph1 = new SurpriseCase(new addPhilter(5));
    static SurpriseCase ph2 = new SurpriseCase(new addPhilter(3));
    static SurpriseCase ph3 = new SurpriseCase(new addPhilter(2));
    static Bonus bonus = new Bonus(5);
    static Malus m1 = new Malus(5);
    static Malus m2 = new Malus(5);
    static Joker joker1 = new Joker(25);
    static Joker joker2 = new Joker(50);
    static Pioche maListe = new Pioche();
    static Case test = new Case();
    static Board board = new Board();
    public static void main(String[] args) {

        ArrayList<Weapon> weaponList = new ArrayList<Weapon>();
        weaponList.add(w1);
        weaponList.add(w2);
        weaponList.add(w3);

        //------------------liste des sorts-----------------------------------
        ArrayList<Spell> spellList = new ArrayList<Spell>();
        spellList.add(s1);
        spellList.add(s2);
        spellList.add(s3);

        ArrayList<Dragon> dragonList = new ArrayList<Dragon>();
        d1.setCaseNum(maListe.getListID().get(1));
        board.getCases().get(maListe.getListID().get(1)).setEv(d1);
        dragonList.add(d1);
        d2.setCaseNum(maListe.getListID().get(2));
        dragonList.add(d2);
        d3.setCaseNum(maListe.getListID().get(3));
        dragonList.add(d3);
        d4.setCaseNum(maListe.getListID().get(4));
        dragonList.add(d4);
        d5.setCaseNum(maListe.getListID().get(5));
        dragonList.add(d5);
        d6.setCaseNum(maListe.getListID().get(6));
        dragonList.add(d6);

        ArrayList<Wizzard> wizzardList = new ArrayList<Wizzard>();
        wz1.setCaseNum(maListe.getListID().get(7));
        board.getCases().get(maListe.getListID().get(7)).setEv(wz1);
        wizzardList.add(wz1);
        wz2.setCaseNum(maListe.getListID().get(8));
        wizzardList.add(wz2);
        wz3.setCaseNum(maListe.getListID().get(9));
        wizzardList.add(wz3);
        wz4.setCaseNum(maListe.getListID().get(10));
        wizzardList.add(wz4);
        
        ArrayList<Succubi> succubiList = new ArrayList<Succubi>();
        suc1.setCaseNum(maListe.getListID().get(11));
        board.getCases().get(maListe.getListID().get(11)).setEv(suc1);
        succubiList.add(suc1);
        suc2.setCaseNum(maListe.getListID().get(12));
        board.getCases().get(maListe.getListID().get(12)).setEv(suc2);
        succubiList.add(suc2);
        suc3.setCaseNum(maListe.getListID().get(13));
        board.getCases().get(maListe.getListID().get(13)).setEv(suc3);
        succubiList.add(suc3);
        suc4.setCaseNum(maListe.getListID().get(14));
        succubiList.add(suc4);

        Board jeu = new Board();
        jeu.getCases();
        

//-----------------jeu-----------------------------------------
        showMenu();
        createCharacter();
        chooseEquipment(weaponList, spellList);
//        attributeNumberCaseToOpponent();
        moveCase();
        draw(args);

    }

    //--------------méthode qui affiche le menu-------------------
    public static void showMenu() {
        // String chType;
        String input;


		do {
			System.out.println("Choisis un personnage \n1-Guerrier \n2-Magicien");
			input = sc.nextLine();
			try {
				int test = Integer.parseInt(input);
			}
			catch(NumberFormatException e)
			{
				System.out.printf("\"%s\" n'est pas valide.\n", input);
			}
         } while (!(input.equals("1") || input.equals("2")));
       if(input.equals("1")) {
    	   classe = "1";
        }else if (input.equals("2")){
        	classe = "2";
            }
    }

    //--------------méthode pour créer un personnage-------------------
    public static void createCharacter() {


    	if (classe.equals("1")) {
    		createWarrior();
    	} else {
    		createMagician();
    	}
    }

    public static void createWarrior() {
        X = new Warrior();
        System.out.println("Entre le nom de ton guerrier");
        X.setName(sc.nextLine());
        System.out.println("Ajoute une image");
        System.out.println(d1.getCaseNum());
        System.out.println(suc1.getCaseNum());
        System.out.println(wz1.getCaseNum());
        System.out.println(suc2.getCaseNum());
        System.out.println(suc3.getCaseNum());
        X.setPicture(sc.nextLine());
        System.out.println("Ton Guerrier porte le nom de " + X.getName() + " et a l'image : " + X.getPicture());
    }

    public static void createMagician() {
        Y = new Magician();
        System.out.println("Entre le nom de ton magicien");
        Y.setName(sc.nextLine());
        System.out.println("Ajoute une image");
        Y.setPicture(sc.nextLine());
        System.out.println("Ton Magicien porte le nom de " + Y.getName() + " et a l'image : " + Y.getPicture());
    }

    //--------------méthode pour choisir armes ou sorts---------------------
    public static void chooseEquipment(ArrayList<Weapon> weaponList, ArrayList<Spell> spellList) {
        String test;
        if (classe.equals("1")) {
            for (int i = 0; i < weaponList.size(); i++) {
                System.out.println(+i + " - " + weaponList.get(i).name);
            }
            do {
                System.out.println("Choisis une arme");
                test = sc.nextLine();
                if (test.equals("0")) {
                    X.setWeapon(w1);
                } else if (test.equals("1")) {
                    X.setWeapon(w2);
                } else if (test.equals("2")) {
                    X.setWeapon(w3);
                }

            } while (!(test.equals("0") || test.equals("1") || test.equals("2")));

        } else if (classe.equals("2")) {

            for (int j = 0; j < spellList.size(); j++) {
                System.out.println(j + " - " + spellList.get(j).name);
            }
            do {
                System.out.println("Choisis un sort");
                test = sc.nextLine();
                if (test.equals("0")) {
                    Y.setSpell(s1);
                } else if (test.equals("1")) {
                    Y.setSpell(s2);
                } else if (test.equals("2")) {
                    Y.setSpell(s3);
                }
            } while (!(test.equals("0") || test.equals("1") || test.equals("2")));
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
                X.setCaseNum(X.getCaseNum() + dice1.getN());
                System.out.println("Tu es à la case : " + X.getCaseNum() + "/64");
                Case playerCase = board.getCases().get(X.getCaseNum());
                if (playerCase.getEv() != null) {
                		
                	System.out.println("Y'a quelqu'un");
                	if (playerCase.getEv() instanceof Opponent) {
                		System.out.println("C'est un ennemi !");
                		if (playerCase.getEv() instanceof Dragon) {
                			System.out.println("C'est un dragon !");
                		} else if (playerCase.getEv() instanceof Succubi) {
                			System.out.println("C'est une succube !");
                		} else if (playerCase.getEv() instanceof Wizzard) {
                			System.out.println("C'est un wizard !");
                		}
                	}
                } else {
                	System.out.println("y'a personne");
                }
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

        s4.setCaseNum(maListe.getListID().get(15));
        addWeaponArrayList.add(s4);
        s5.setCaseNum(maListe.getListID().get(16));
        addWeaponArrayList.add(s5);

        for (i = 0; i < addWeaponArrayList.size(); i++) {
            addWeaponArrayList.get(i);
            System.out.println("Tu es tombé sur la case surprise 'arme', tu récupères une " + addWeaponArrayList.get(i));
        }
    }

    //----------------caisse surprise bouclier---------------
    public static void shieldSurprise() {
        ArrayList<SurpriseCase> addShieldList = new ArrayList<SurpriseCase>();
        sh1.setCaseNum(maListe.getListID().get(17));
        addShieldList.add(sh1);
        sh2.setCaseNum(maListe.getListID().get(18));
        addShieldList.add(sh2);
        sh3.setCaseNum(maListe.getListID().get(19));
        addShieldList.add(sh3);
        System.out.println(sh1 + "\n" + sh2 + "\n" + sh3);
    }

    //-------------------caisse surprise philtre------------------
    public static void philterSurprise() {
        ArrayList<SurpriseCase> addPhilterList = new ArrayList<SurpriseCase>();
        ph1.setCaseNum(maListe.getListID().get(20));
        addPhilterList.add(ph1);
        ph2.setCaseNum(maListe.getListID().get(21));
        addPhilterList.add(ph2);
        ph3.setCaseNum(maListe.getListID().get(22));
        addPhilterList.add(ph3);
        System.out.println(ph1 + "\n" + ph2 + "\n" + ph3);
    }

    //------------------caisse surprise sort---------------------
    public static void spellSurprise() {
        ArrayList<SurpriseCase> addSpellList = new ArrayList<SurpriseCase>();
        sp1.setCaseNum(maListe.getListID().get(23));
        addSpellList.add(sp1);
        sp2.setCaseNum(maListe.getListID().get(24));
        addSpellList.add(sp2);
        System.out.println(sp1 + "\n" + sp2);
    }


    //----------------pour tirer 27 cases aléatoires-----------------
    public static void draw (String[] args) {
        Pioche maListe = new Pioche();
        for (int i=0; i<27;i++){
            System.out.println(maListe.getListID().get(i));
        }
        
    }

    //---------------caisse bonus----------------------------
    public static int bonusSurprise(int currentCase) {
        System.out.println("Tu es tombé sur la case surprise 'bonus', tu avances de 5 cases");
        bonus.setCaseNum(maListe.getListID().get(25));
        currentCase = currentCase + bonus.getCases();
        System.out.println("Tu es à la case : " + currentCase + "/64");
        return currentCase;
    }

    //--------------caisse malus-------------------
    public static int malusSurprise(int currentCase) {
        System.out.println("Tu es tombé sur la case surprise 'malus', tu recules de 5 cases");
        m1.setCaseNum(maListe.getListID().get(26));
        currentCase = currentCase - m1.getCases();
        m2.setCaseNum(maListe.getListID().get(27));
        currentCase = currentCase - m2.getCases();
        System.out.println("Tu es à la case : " + currentCase + "/64");
        return currentCase;
    }

    //-----------------2 caisses joker--------------
    public int jokerSurprise25(int levelLifeCharacter) {
        System.out.println("Tu es tombé sur la case joker \nTu gagnes 25 points de vie");
        joker1.setCaseNum(maListe.getListID().get(28));
        levelLifeCharacter = levelLifeCharacter + joker1.getLife();
        System.out.println("Ton niveau de vie est de : " + levelLifeCharacter);
        return levelLifeCharacter;
    }

    public int jokerSurprise50(int levelLifeCharacter) {
        System.out.println("Tu es tombé sur la case joker \nTu gagnes 50 points de vie");
        joker2.setCaseNum(maListe.getListID().get(29));
        levelLifeCharacter = levelLifeCharacter + joker2.getLife();
        System.out.println("Ton niveau de vie est de : " + levelLifeCharacter);
        return levelLifeCharacter;
    }



}



