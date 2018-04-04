package game;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Choisissez un personnage \n 1-Guerrier \n 2-Magicien");
        int chooseCharacter = sc.nextInt();
        sc.nextLine();
        System.out.println("Entrez le nom de votre personnage");
        String chooseName = sc.nextLine();
        System.out.println("vous avez le personnage : " +chooseCharacter+ " qui porte le nom de " + chooseName);

    }
}
