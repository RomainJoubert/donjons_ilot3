package game;

import box.*;
import character.Character;
import equipment.Weapon;
import equipment.Spell;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        //---------------liste des armes--------------------------------------
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

        //-----------------jeu-----------------------------------------
        showMenu();
        createCharacter();
        chooseEquipment(weaponList, spellList);
        moveCase();
        playAgain();
        

    }

    //--------------méthode qui affiche le menu-------------------
    public static void showMenu() {
        System.out.println("Choisis un personnage \n1-Guerrier \n2-Magicien");
        String chType;
        sc.nextInt();
        sc.nextLine();
       /* if(sc.nextInt() == 1) {
            chType = "Guerrier";
            chara.setChType(chType); // chara correspond au personnage crée
        }else{
            chType = "Magicien";
            chara.setChType(chType); NE PAS SUPPRIMER - UTILE POUR LA SUITE - RECUPERE LE TYPE DU PERSO CREE
            } */
    }

    //--------------méthode pour créer un personnage-------------------
    public static void createCharacter() {
        System.out.println("Entre le nom de ton personnage");
        String nameChoice = sc.nextLine();
        System.out.println("Ajoute une image");
        String pictureChoice = sc.nextLine();
        System.out.println("Ton personnage porte le nom de " + nameChoice + " et a l'image : " + pictureChoice);
    }

    //--------------méthode pour choisir armes ous sorts---------------------
    public static void chooseEquipment(ArrayList<Weapon> weaponList, ArrayList<Spell> spellList) {
        String charaGetType = "Magicien"; //juste pour tester tant que les perso ne sont pas stockés, à enlever ensuite.

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
        do {
            System.out.println("Lancer le dé ? \n1-oui \n2-non");
            nb = sc.nextInt();
            sc.nextLine();
            if (nb == 1) {
                Dice dice1 = new Dice();
                dice1.randomNumber();
                System.out.println("Tu as fait : " + dice1.getN());
                cases = cases + dice1.getN();
                System.out.println("Tu es à la case : " + cases + "/64");

            } else {
                exit = true;
                System.out.println("Tu es sorti(e) du game !");
            }
        } while (cases < 10 && !exit);

        return cases;
    }


    //-----------------méthode pour relancer une partie--------------------
    public static void playAgain() {
        int test;
        System.out.println(" \nUne autre partie? \n 1 - Oui \n 2 - Non");
        test = sc.nextInt();
        while (test == 1) {
            moveCase();
            System.out.println(" \nUne autre partie? \n 1 - Oui \n 2 - Non");
            test = sc.nextInt(); //code dupliqué sinon on ne sort pas du DO/While de la méthode moveCase
            sc.nextLine();
        }
        System.out.println("A bientôt !");
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
    public static void shieldSurprise(){
        ArrayList<SurpriseCase> addShieldList = new ArrayList<SurpriseCase>();
        SurpriseCase sh1 = new SurpriseCase(new addShield( 5));
        addShieldList.add(sh1);
        SurpriseCase sh2 = new SurpriseCase(new addShield(3));
        addShieldList.add(sh2);
        SurpriseCase sh3 = new SurpriseCase(new addShield( 2));
        addShieldList.add(sh3);
        System.out.println(sh1 +"\n" + sh2 +"\n" +sh3);

    }

    //-------------------caisse surprise philtre------------------
    public static void philterSurprise() {
        ArrayList<SurpriseCase> addPhilterList = new ArrayList<SurpriseCase>();
        SurpriseCase ph1 = new SurpriseCase(new addPhilter(5));
        addPhilterList.add(ph1);
        SurpriseCase ph2 = new SurpriseCase(new addPhilter(3));
        addPhilterList.add(ph2);
        SurpriseCase ph3 = new SurpriseCase(new addPhilter(5));
        addPhilterList.add(ph3);
        System.out.println(ph1 + "\n" + ph2 + "\n" + ph3);
    }

    //------------------caisse surprise sort---------------------
    public static void spellSurprise(){
        ArrayList<SurpriseCase> addSpellList = new ArrayList<SurpriseCase>();
        SurpriseCase sp1 = new SurpriseCase(new addSpell("Boule de feu", 50));
        addSpellList.add(sp1);
        SurpriseCase sp2 = new SurpriseCase(new addSpell("Lévitation", 25));
        addSpellList.add(sp2);
        System.out.println(sp1 + "\n" + sp2);
    }

}



