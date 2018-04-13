package game;

import box.*;
import character.Magician;
import character.Warrior;
import equipment.*;
import opponent.Dragon;
import opponent.Succubi;
import opponent.Wizzard;


import java.util.ArrayList;
import java.util.Scanner;

public class Board {
    private static Scanner sc = new Scanner(System.in);
    private int cases;
    private String input;
    private String test;
    private Pioche maListe = new Pioche();
    private Warrior X = new Warrior();
    private Magician Y = new Magician();
    public AddWeapon addWeapon;


    //----------------------- création des cases surprises -----------------------------------
    public SurpriseCase w4 = new SurpriseCase(new AddWeapon("bombe", 100));
    private SurpriseCase w5 = new SurpriseCase(new AddWeapon("hache", 25));
    private SurpriseCase sp1 = new SurpriseCase(new AddSpell("Boule de feu", 50));
    private SurpriseCase sp2 = new SurpriseCase(new AddSpell("Lévitation", 25));
    private SurpriseCase sh1 = new SurpriseCase(new AddShield(5));
    private SurpriseCase sh2 = new SurpriseCase(new AddShield(3));
    private SurpriseCase sh3 = new SurpriseCase(new AddShield(2));
    private SurpriseCase ph1 = new SurpriseCase(new AddPhilter(5));
    private SurpriseCase ph2 = new SurpriseCase(new AddPhilter(3));
    private SurpriseCase ph3 = new SurpriseCase(new AddPhilter(2));
    private SurpriseCase b1 = new SurpriseCase(new Bonus());
    private SurpriseCase m1 = new SurpriseCase(new Malus());
    private SurpriseCase m2 = new SurpriseCase(new Malus());
    private SurpriseCase j1 = new SurpriseCase(new Joker25());
    private SurpriseCase j2 = new SurpriseCase(new Joker50());

    //------------------------ création des ennemis -----------------------------
    private SurpriseCase drag1 = new SurpriseCase(new Dragon(80, 80));
    private SurpriseCase drag2 = new SurpriseCase(new Dragon(60, 60));
    private SurpriseCase drag3 = new SurpriseCase(new Dragon(40, 40));
    private SurpriseCase drag4 = new SurpriseCase(new Dragon(30, 30));
    private SurpriseCase drag5 = new SurpriseCase(new Dragon(20, 20));
    private SurpriseCase drag6 = new SurpriseCase(new Dragon(15, 15));
    private SurpriseCase wizz1 = new SurpriseCase(new Wizzard(75));
    private SurpriseCase wizz2 = new SurpriseCase(new Wizzard(50));
    private SurpriseCase wizz3 = new SurpriseCase(new Wizzard(25));
    private SurpriseCase wizz4 = new SurpriseCase(new Wizzard(15));
    private SurpriseCase suc1 = new SurpriseCase(new Succubi("Cruella", 75));
    private SurpriseCase suc2 = new SurpriseCase(new Succubi("Raiponce", 50));
    private SurpriseCase suc3 = new SurpriseCase(new Succubi("Cendrillon", 25));
    private SurpriseCase suc4 = new SurpriseCase(new Succubi("Elsa", 15));

    //----------------- création de l'équipement pour guerrier et magicien -------
    private Weapon w1 = new Bow("Arc", 50);
    private Weapon w2 = new Club("Massue", 30);
    private Weapon w3 = new Sword("Epée", 25);
    private Spell s1 = new Ligthning("Eclair", 50);
    private Spell s2 = new Invisibility("Invisibilité", 30);
    private Spell s3 = new FireWall("Mur de feu", 25);

    //---------------- liste des méthodes -----------------

    public Board(int cases) {
        this.cases = cases;
    }

    public int getCases() {
        return cases;
    }

    public void setCases(int cases) {
        this.cases = cases;
    }

    public void draw() {
        for (int i = 0; i < 29; i++) {
            System.out.println(maListe.getListID().get(i));
        }
    }

    public void putCaseSurprise() {
        int i;
        ArrayList<SurpriseCase> surpriseList = new ArrayList<SurpriseCase>();
        w4.setCaseNum(maListe.getListID().get(15));
        surpriseList.add(w4);
        w5.setCaseNum(maListe.getListID().get(16));
        surpriseList.add(w5);
        sp1.setCaseNum(maListe.getListID().get(23));
        surpriseList.add(sp1);
        sp2.setCaseNum(maListe.getListID().get(24));
        surpriseList.add(sp2);
        sh1.setCaseNum(maListe.getListID().get(17));
        surpriseList.add(sh1);
        sh2.setCaseNum(maListe.getListID().get(18));
        surpriseList.add(sh2);
        sh3.setCaseNum(maListe.getListID().get(19));
        surpriseList.add(sh3);
        ph1.setCaseNum(maListe.getListID().get(20));
        surpriseList.add(ph1);
        ph2.setCaseNum(maListe.getListID().get(21));
        surpriseList.add(ph2);
        ph3.setCaseNum(maListe.getListID().get(22));
        surpriseList.add(ph3);
        b1.setCaseNum(maListe.getListID().get(25));
        surpriseList.add(b1);
        m1.setCaseNum(maListe.getListID().get(26));
        surpriseList.add(m1);
        m2.setCaseNum(maListe.getListID().get(27));
        surpriseList.add(m2);
        j1.setCaseNum(maListe.getListID().get(28));
        surpriseList.add(j1);
        j2.setCaseNum(maListe.getListID().get(29));
        surpriseList.add(j2);
        suc1.setCaseNum(maListe.getListID().get(1));
        surpriseList.add(suc1);
        suc2.setCaseNum(maListe.getListID().get(2));
        surpriseList.add(suc2);
        suc3.setCaseNum(maListe.getListID().get(3));
        surpriseList.add(suc3);
        suc4.setCaseNum(maListe.getListID().get(4));
        surpriseList.add(suc4);
        drag1.setCaseNum(maListe.getListID().get(5));
        surpriseList.add(drag1);
        drag2.setCaseNum(maListe.getListID().get(6));
        surpriseList.add(drag2);
        drag3.setCaseNum(maListe.getListID().get(7));
        surpriseList.add(drag1);
        drag4.setCaseNum(maListe.getListID().get(8));
        surpriseList.add(drag4);
        drag5.setCaseNum(maListe.getListID().get(9));
        surpriseList.add(drag5);
        drag6.setCaseNum(maListe.getListID().get(10));
        surpriseList.add(drag6);
        wizz1.setCaseNum(maListe.getListID().get(11));
        surpriseList.add(wizz1);
        wizz2.setCaseNum(maListe.getListID().get(12));
        surpriseList.add(wizz2);
        wizz3.setCaseNum(maListe.getListID().get(13));
        surpriseList.add(wizz3);
        wizz4.setCaseNum(maListe.getListID().get(14));
        surpriseList.add(wizz4);

        for (i = 0; i < surpriseList.size(); i++) {
            surpriseList.get(i);
//            System.out.println(surpriseList.get(i) + " \nnuméro de case : " + surpriseList.get(i).getCaseNum());
        }

    }

    public void createCharacter() {
        int test;
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
            createWarrior();
        } else if (input.equals("2")) {
            createMagician();
        }
    }

    public void createWarrior() {
        System.out.println("Entre le nom de ton guerrier");
        X.setName(sc.nextLine());
        System.out.println("Ajoute une image");
        X.setPicture(sc.nextLine());
        System.out.println("Ton Guerrier porte le nom de " + X.getName() + " et a l'image : " + X.getPicture());
    }

    public void createMagician() {
        System.out.println("Entre le nom de ton magicien");
        Y.setName(sc.nextLine());
        System.out.println("Ajoute une image");
        Y.setPicture(sc.nextLine());
        System.out.println("Ton Magicien porte le nom de " + Y.getName() + " et a l'image : " + Y.getPicture());
    }

    public void chooseEquipment() {
        ArrayList<Weapon> weaponList = new ArrayList<Weapon>();
        weaponList.add(w1);
        weaponList.add(w2);
        weaponList.add(w3);

        ArrayList<Spell> spellList = new ArrayList<Spell>();
        spellList.add(s1);
        spellList.add(s2);
        spellList.add(s3);

        if (input.equals("1")) {
            for (int i = 0; i < weaponList.size(); i++) {
                System.out.println(+i + " - " + weaponList.get(i).getName());
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

        } else if (input.equals("2")) {
            for (int j = 0; j < spellList.size(); j++) {
                System.out.println(j + " - " + spellList.get(j).getName());
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

    public int moveCase() {
        boolean exit = false;
        int nb;
        String input2;
        cases = 0;

        do {
            do {
                System.out.println("Lancer le dé ? \n1 - oui \n2 - non");
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

    public void playAgain() {
        int test;
        String choix;
        do {
            System.out.println(" \nUne autre partie? \n1 - Oui \n2 - Non");
            choix = sc.nextLine();
            try {
                test = Integer.parseInt(choix);
            } catch (NumberFormatException e) {
                System.out.printf("\"%s\" n'est pas valide.\n", choix);
            }
        } while (!(choix.equals("1") || choix.equals("2")));

        if (choix.equals("1")) {
            System.out.println("Veux-tu garder le même personnage ? \n1 - oui \n2 - non");
            choix = sc.nextLine();
            if (choix.equals("2")) {
                createCharacter();
                moveCase();
            } else {
                moveCase();
            }
        } else if (choix.equals("2")) {
            System.out.println("A bientôt !");
        }
    }

}
