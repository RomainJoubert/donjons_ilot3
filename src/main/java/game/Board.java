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


    //---------------cases surprises----------------
public class Board extends Main {

    private static Scanner sc = new Scanner(System.in);
    private int cases1;
    private String input;
    private String test;
    private static Board board = new Board(64);
    private Pioche maListe = new Pioche();
    public character.Character perso;
    /* = new Warrior();
     private character.Character Y = new Magician();
 */
    //----------------------- création des cases surprises -----------------------------------
    private SurpriseCase w4 = new SurpriseCase(new AddWeapon("bombe", 100));
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
    private ArrayList<Cases> tabCases = new ArrayList<Cases>();

    public ArrayList<Cases> getTabCases() {
        return tabCases;
    }

    public void setTabCases(ArrayList<Cases> Tabcases) {
        this.tabCases = Tabcases;
    }


    public Board(int taille_board) {
        for (int i = 0; i < taille_board; i++) {
            tabCases.add(new Cases());
        }
    }


    public void draw() {
        for (int i = 0; i < 29; i++) {
            System.out.println(maListe.getListID().get(i));
        }
    }

    public void putCaseSurprise() {
        int i;
        ArrayList<SurpriseCase> surpriseList = new ArrayList<SurpriseCase>();
        suc1.setCaseNum(maListe.getListID().get(1));
        board.getTabCases().get(maListe.getListID().get(1)).setEv(suc1);
        surpriseList.add(suc1);
        suc2.setCaseNum(maListe.getListID().get(2));
        board.getTabCases().get(maListe.getListID().get(2)).setEv(suc2);
        surpriseList.add(suc2);
        suc3.setCaseNum(maListe.getListID().get(3));
        board.getTabCases().get(maListe.getListID().get(3)).setEv(suc3);
        surpriseList.add(suc3);
        suc4.setCaseNum(maListe.getListID().get(4));
        board.getTabCases().get(maListe.getListID().get(4)).setEv(suc4);
        surpriseList.add(suc4);
        drag1.setCaseNum(maListe.getListID().get(5));
        board.getTabCases().get(maListe.getListID().get(5)).setEv(drag1);
        surpriseList.add(drag1);
        drag2.setCaseNum(maListe.getListID().get(6));
        board.getTabCases().get(maListe.getListID().get(6)).setEv(drag2);
        surpriseList.add(drag2);
        drag3.setCaseNum(maListe.getListID().get(7));
        board.getTabCases().get(maListe.getListID().get(7)).setEv(drag3);
        surpriseList.add(drag1);
        drag4.setCaseNum(maListe.getListID().get(8));
        board.getTabCases().get(maListe.getListID().get(8)).setEv(drag4);
        surpriseList.add(drag4);
        drag5.setCaseNum(maListe.getListID().get(9));
        board.getTabCases().get(maListe.getListID().get(9)).setEv(drag5);
        surpriseList.add(drag5);
        drag6.setCaseNum(maListe.getListID().get(10));
        board.getTabCases().get(maListe.getListID().get(10)).setEv(drag6);
        surpriseList.add(drag6);
        wizz1.setCaseNum(maListe.getListID().get(11));
        board.getTabCases().get(maListe.getListID().get(11)).setEv(wizz1);
        surpriseList.add(wizz1);
        wizz2.setCaseNum(maListe.getListID().get(12));
        board.getTabCases().get(maListe.getListID().get(12)).setEv(wizz2);
        surpriseList.add(wizz2);
        wizz3.setCaseNum(maListe.getListID().get(13));
        board.getTabCases().get(maListe.getListID().get(13)).setEv(wizz3);
        surpriseList.add(wizz3);
        wizz4.setCaseNum(maListe.getListID().get(14));
        board.getTabCases().get(maListe.getListID().get(14)).setEv(wizz4);
        surpriseList.add(wizz4);
        w4.setCaseNum(maListe.getListID().get(15));
        board.getTabCases().get(maListe.getListID().get(15)).setEv(w4);
        surpriseList.add(w4);
        w5.setCaseNum(maListe.getListID().get(16));
        board.getTabCases().get(maListe.getListID().get(16)).setEv(w5);
        surpriseList.add(w5);
        sh1.setCaseNum(maListe.getListID().get(17));
        board.getTabCases().get(maListe.getListID().get(17)).setEv(sh1);
        surpriseList.add(sh1);
        sh2.setCaseNum(maListe.getListID().get(18));
        board.getTabCases().get(maListe.getListID().get(18)).setEv(sh2);
        surpriseList.add(sh2);
        sh3.setCaseNum(maListe.getListID().get(19));
        board.getTabCases().get(maListe.getListID().get(19)).setEv(sh3);
        surpriseList.add(sh3);
        ph1.setCaseNum(maListe.getListID().get(20));
        board.getTabCases().get(maListe.getListID().get(20)).setEv(ph1);
        surpriseList.add(ph1);
        ph2.setCaseNum(maListe.getListID().get(21));
        board.getTabCases().get(maListe.getListID().get(21)).setEv(ph2);
        surpriseList.add(ph2);
        ph3.setCaseNum(maListe.getListID().get(22));
        board.getTabCases().get(maListe.getListID().get(22)).setEv(ph3);
        surpriseList.add(ph3);
        sp1.setCaseNum(maListe.getListID().get(23));
        board.getTabCases().get(maListe.getListID().get(23)).setEv(sp1);
        surpriseList.add(sp1);
        sp2.setCaseNum(maListe.getListID().get(24));
        board.getTabCases().get(maListe.getListID().get(24)).setEv(sp2);
        surpriseList.add(sp2);
        b1.setCaseNum(maListe.getListID().get(25));
        board.getTabCases().get(maListe.getListID().get(25)).setEv(b1);
        surpriseList.add(b1);
        m1.setCaseNum(maListe.getListID().get(26));
        board.getTabCases().get(maListe.getListID().get(26)).setEv(m1);
        surpriseList.add(m1);
        m2.setCaseNum(maListe.getListID().get(27));
        board.getTabCases().get(maListe.getListID().get(27)).setEv(m2);
        surpriseList.add(m2);
        j1.setCaseNum(maListe.getListID().get(28));
        board.getTabCases().get(maListe.getListID().get(28)).setEv(j1);
        surpriseList.add(j1);
        j2.setCaseNum(maListe.getListID().get(29));
        board.getTabCases().get(maListe.getListID().get(29)).setEv(j2);
        surpriseList.add(j2);


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
        perso = new Warrior();
        System.out.println("Entre le nom de ton guerrier");
        perso.setName(sc.nextLine());
        System.out.println("Ajoute une image");
        perso.setPicture(sc.nextLine());
        System.out.println("Ton Guerrier porte le nom de " + perso.getName() + " et a l'image : " + perso.getPicture());
        perso.save();

    }



    public void createMagician() {
        perso = new Magician();
        System.out.println("Entre le nom de ton magicien");
        perso.setName(sc.nextLine());
        System.out.println("Ajoute une image");
        perso.setPicture(sc.nextLine());
        System.out.println("Ton Magicien porte le nom de " + perso.getName() + " et a l'image : " + perso.getPicture());
        perso.save();
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
                    ((Warrior) perso).setWeapon(w1);
                } else if (test.equals("1")) {
                    ((Warrior) perso).setWeapon(w2);
                } else if (test.equals("2")) {
                    ((Warrior) perso).setWeapon(w3);
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
                    ((Magician) perso).setSpell(s1);
                } else if (test.equals("1")) {
                    ((Magician) perso).setSpell(s2);
                } else if (test.equals("2")) {
                    ((Magician) perso).setSpell(s3);
                }
            } while (!(test.equals("0") || test.equals("1") || test.equals("2")));
        }
    }

    public int moveCase() {
        boolean exit = false;
        int nb;
        String input2;
        cases1 = 0;
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
                cases1 = cases1 + dice1.getN();
                System.out.println("Tu es à la case : " + cases1 + "/64");
//                  get evenement (w) de la case numero cases
//                  w.faireAction(this, perso );

            } else if (input2.equals("2")) {
                exit = true;
                System.out.println("Tu es sorti(e) du game !");
            }
        } while (cases1 < 10 && !exit);
        playAgain();
        return cases1;
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
