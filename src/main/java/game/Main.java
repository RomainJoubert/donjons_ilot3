package game;

import character.Warrior;
import character.Magician;
import equipment.*;

import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static String charaGetType;
    private static String classe;
    private static Warrior X;
    private static Magician Y;

    private static Weapon w1 = new Bow("Arc", 50);
    private static Weapon w2 = new Club("Massue", 30);
    private static Weapon w3 = new Sword("Epée", 25);
    private static Spell s1 = new Ligthning("Eclair", 50);
    private static Spell s2 = new Invisibility("Invisibilité", 30);
    private static Spell s3 = new FireWall("Mur de feu", 25);

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

//-----------------jeu-----------------------------------------
        showMenu();
        createCharacter();
        chooseEquipment(weaponList, spellList);
        moveCase();
    }

    //--------------méthode qui affiche le menu-------------------
    public static void showMenu() {
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
            classe = "1";
        } else if (input.equals("2")) {
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

        } else if (classe.equals("2")) {

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
            System.out.println(" \nUne autre partie? \n1 - Oui \n2 - Non");
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
//    public static void weaponSurprise() {
//        int i;
//        ArrayList<SurpriseCase> addWeaponArrayList = new ArrayList<SurpriseCase>();
//        s4.setCaseNum(maListe.getListID().get(15));
//        addWeaponArrayList.add(s4);
//        s5.setCaseNum(maListe.getListID().get(16));
//
//        for (i = 0; i < addWeaponArrayList.size(); i++) {
//            addWeaponArrayList.get(i);
//            System.out.println(addWeaponArrayList.get(i));
//        }
//    }

    //----------------caisse surprise bouclier---------------
//    public static void shieldSurprise() {
//        ArrayList<SurpriseCase> addShieldList = new ArrayList<SurpriseCase>();
//        sh1.setCaseNum(maListe.getListID().get(17));
//        addShieldList.add(sh1);
//        sh2.setCaseNum(maListe.getListID().get(18));
//        addShieldList.add(sh2);
//        sh3.setCaseNum(maListe.getListID().get(19));
//        addShieldList.add(sh3);
//        System.out.println(sh1 + "\n" + sh2 + "\n" + sh3);
//    }

    //-------------------caisse surprise philtre------------------
//    public static void philterSurprise() {
//        ArrayList<SurpriseCase> addPhilterList = new ArrayList<SurpriseCase>();
//        ph1.setCaseNum(maListe.getListID().get(20));
//        addPhilterList.add(ph1);
//        ph2.setCaseNum(maListe.getListID().get(21));
//        addPhilterList.add(ph2);
//        ph3.setCaseNum(maListe.getListID().get(22));
//        addPhilterList.add(ph3);
//        System.out.println(ph1 + "\n" + ph2 + "\n" + ph3);
//    }

    //------------------caisse surprise sort---------------------
//    public static void spellSurprise() {
//        ArrayList<SurpriseCase> addSpellList = new ArrayList<SurpriseCase>();
//        sp1.setCaseNum(maListe.getListID().get(23));
//        addSpellList.add(sp1);
//        sp2.setCaseNum(maListe.getListID().get(24));
//        addSpellList.add(sp2);
//        System.out.println(sp1 + "\n" + sp2);
//    }

    //----------------pour tirer 27 cases aléatoires-----------------
//    public static void draw() {
//        Pioche maListe = new Pioche();
//
//        for (int i = 0; i < 27; i++) {
//            System.out.println(maListe.getListID().get(i));
//        }
//    }

    //---------------caisse bonus----------------------------
//    public static int bonusSurprise(int currentCase) {
//        System.out.println("Tu es tombé sur la case surprise 'bonus', tu avances de 5 cases");
//        bonus.setCaseNum(maListe.getListID().get(25));
//        currentCase = currentCase + bonus.getCases();
//        System.out.println("Tu es à la case : " + currentCase + "/64");
//        return currentCase;
//    }

    //--------------caisse malus-------------------
//    public static int malusSurprise(int currentCase) {
//        System.out.println("Tu es tombé sur la case surprise 'malus', tu recules de 5 cases");
//        m1.setCaseNum(maListe.getListID().get(26));
//        currentCase = currentCase - m1.getCases();
//        m2.setCaseNum(maListe.getListID().get(27));
//        currentCase = currentCase - m2.getCases();
//        System.out.println("Tu es à la case : " + currentCase + "/64");
//        return currentCase;
//    }

    //-----------------2 caisses joker--------------
//    public int jokerSurprise25(int levelLifeCharacter) {
//        System.out.println("Tu es tombé sur la case joker \nTu gagnes 25 points de vie");
//        joker501.setCaseNum(maListe.getListID().get(28));
//        levelLifeCharacter = levelLifeCharacter + joker501.getLife();
//        System.out.println("Ton niveau de vie est de : " + levelLifeCharacter);
//        return levelLifeCharacter;
//    }
//
//    public int jokerSurprise50(int levelLifeCharacter) {
//        System.out.println("Tu es tombé sur la case joker \nTu gagnes 50 points de vie");
//        joker502.setCaseNum(maListe.getListID().get(29));
//        levelLifeCharacter = levelLifeCharacter + joker502.getLife();
//        System.out.println("Ton niveau de vie est de : " + levelLifeCharacter);
//        return levelLifeCharacter;
//    }

    //------------------méthode pour combat-----------------
//    public static int fightEnemy(Character character, ArrayList<Dragon> dragonList, ArrayList<Weapon> weaponList, int cases) {
//        int StrengthCharac = character.getStrengthCharacter();
//        int lifeOpponent = dragonList.get(0).getLifeLevelOpponent();
//        int lifeCharac = character.getLife();
//
//        if (lifeOpponent > 0) {
//            int newStrengthCharacter = character.getStrengthCharacter() + weaponList.get(1).damagesDragons;
//            System.out.println("Ta force est de " + newStrengthCharacter + "\nChoisis un niveau d'attaque inférieur à " + newStrengthCharacter);
//            int input = sc.nextInt();
//            sc.nextLine();
//            StrengthCharac -= input;
//            lifeOpponent -= input;
//
//            if (lifeOpponent == 0) {
//                cases += 2;
//                System.out.println("Bravo, tu as gagné le combat! tu avances de 2 cases, tu es donc à la case " + cases);
//
//            } else if (lifeCharac > 0) {
//                //pour pouvoir récupérer le nouveau niveau de vie : créer une classe de type Integer
//                //notre class Integer se nomme "MonInt"
//                //MonInt permet de créer un objet qui garde la valeur de l'attribut à l'extérieur de la méthode ennemy
//                MonInt test = new MonInt(lifeCharac);
//                MonInt currentCase = new MonInt(cases);
//                enemy(dragonList, test, currentCase);
//                lifeCharac = test.getVal();//on accède à la valeur lifeCharacter
//            }
//        }
//        return (lifeCharac + StrengthCharac + lifeOpponent + cases);
//    }
//
//    public static void enemy(ArrayList<Dragon> dragonList, MonInt lifeCharacter, MonInt currentCase) {
//        if (dragonList.get(0).getLifeLevelOpponent() > 0 && lifeCharacter.getVal() > 0) {
//            System.out.println("Tu es attaqué par un ennemi \nSon attaque te coûte " + dragonList.get(0).attackLevel + " points de vie \nTu avais " + lifeCharacter.toString() + " points de vie");
//            lifeCharacter.setVal(lifeCharacter.getVal() - dragonList.get(0).attackLevel);//on modifie la valeur de lifeCharacter
//            if (lifeCharacter.getVal() > 0) {
//                currentCase.setVal(currentCase.getVal() - 2);
//                System.out.println("Il te reste " + lifeCharacter + " points de vie, tu es donc à la case : " + currentCase);
//            } else {
//                System.out.println("Tu es mort \nGAME OVER");
//            }
//        }
//    }

}



