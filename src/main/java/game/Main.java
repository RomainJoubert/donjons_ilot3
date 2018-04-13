package game;


import box.AddWeapon;
import box.Surprise;
import character.Magician;
import character.Warrior;

public class Main {


    public static void main(String[] args) {

        Board board =new Board();
        board.putCaseSurprise();
        board.createCharacter();
        board.chooseEquipment();
        board.moveCase();
        AddWeapon w = new AddWeapon("arc", 10);

        w.faireAction(board,board.perso );

    }

}



