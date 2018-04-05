package game;


import character.Character;
import equipment.Weapon;
import equipment.Spell;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    private static Scanner sc = new Scanner(System.in);




    public static void main(String[] args) {


        showMenu();
        createCharacter();



        ArrayList<Weapon> weaponList = new ArrayList<Weapon>();
        Weapon w1 = new Weapon("Arc", 50,25, 0);
        weaponList.add(w1);
        Weapon w2 = new Weapon("Massue", 30,30,30);
        weaponList.add(w2);
        Weapon w3 = new Weapon("Epée", 25,25,25);
        weaponList.add(w3);


        ArrayList <Spell> spellList = new ArrayList<Spell>();
        Spell s1 = new Spell("Eclair", 25,0,50);
        spellList.add(s1);
        Spell s2 = new Spell("Invisibilité", 30,30,30);
        spellList.add(s2);
        Spell s3 = new Spell("Mur de feu", 25,25,25);
        spellList.add(s3);

        chooseEquipment(weaponList, spellList);
        moveCase();

    }


   public static void chooseEquipment(ArrayList<Weapon> weaponList , ArrayList<Spell>spellList){
        String charaGetType = "Magicien"; //juste pour tester tant que les perso ne sont pas stockés, à enlever ensuite.

        if(charaGetType.equals("Guerrier")){ //remplacer par chara.getType (chara sera un objet de type Characater et servira à récupérer un personnage crée)
            for(int i = 0; i < weaponList.size(); i++) {
                System.out.println(i + " - " + weaponList.get(i).name);
            }

        }else if(charaGetType.equals("Magicien")){
                for(int j = 0; j < spellList.size(); j++){
                    System.out.println(j + " - " + spellList.get(j).name);
                }
        }
   }



    public static void showMenu(){
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
                dice1.getN();
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


