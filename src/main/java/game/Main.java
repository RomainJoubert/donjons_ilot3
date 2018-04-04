package game;

<<<<<<< HEAD
import character.Character;
import equipment.Weapon;
import equipment.Spell;
import java.util.Random;
=======
>>>>>>> 5ebd636da24748a032b0e10faa5a438e7c3dddb3
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    Character char;
    String nameChoice;


    public static void main(String[] args) {

        showMenu();
<<<<<<< HEAD
        Character char = createCharacter();
        nombreAleatoire();
        chooseEquipment();


=======
        createCharacter();
        moveCase();
>>>>>>> 5ebd636da24748a032b0e10faa5a438e7c3dddb3

        ArrayList <Weapon> weaponList = new ArrayList<Weapon>();
        weaponList.add(w1 = new Weapon("Arc", 50,25));
        weaponList.add(w2 = new Weapon("Massue", 30,30,30));
        weaponList.add(w3 = new Weapon("Epée", 25,25,25));

        ArrayList <Spell> spellList = new ArrayList<Spell>();
        spellList.add(s1 = new Spell("Eclair", 25,0,50));
        spellList.add(s2 = new Spell("Invisibilité", 30,30,30));
        spellList.add(s3 = new Spell("Mur de feu", 25,25,25));

    }

<<<<<<< HEAD
    public static void chooseEquipment(){
        String chType = nameChoice;
        if(chType.equals("Magicien")) {
            char.setChType("magician");
        }else if(chType.equals("Guerrier")) {
            char.setChType("guerrier");
        }else{
            System.out.println("ERROR character type");
            }

            System.out.println(chType);
        }



=======
>>>>>>> 5ebd636da24748a032b0e10faa5a438e7c3dddb3
    public static void showMenu() {
        System.out.println("Choisis un personnage \n1-Guerrier \n2-Magicien");
        sc.nextInt();
        sc.nextLine();
    }


<<<<<<< HEAD
=======


>>>>>>> 5ebd636da24748a032b0e10faa5a438e7c3dddb3
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


