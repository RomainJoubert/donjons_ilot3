package game;

import box.AddSpell;
import box.AddWeapon;


public class Main {

    public static void main(String[] args) {

        Board bo = new Board(64);

        bo.putCaseSurprise();
        bo.createCharacter();
        bo.chooseEquipment();
        bo.moveCase();

//        AddWeapon w = new AddWeapon("arc", 10);
       /* AddSpell s = new AddSpell("boule de feu", 50);
        s.faireAction(bo, bo.perso);*/
//        w.faireAction(bo, bo.perso);

    }

}



 