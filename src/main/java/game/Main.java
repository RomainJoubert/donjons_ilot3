package game;

import box.AddSpell;
import box.AddWeapon;


public class Main {

    public static void main(String[] args) {
<<<<<<< HEAD

        Board bo = new Board(64);
=======
        Board bo = new Board(63);
>>>>>>> 02e3d3d1ded406c95ac20255a1bc9be5a542c4a0
        bo.putCaseSurprise();
        bo.createCharacter();
        bo.chooseEquipment();
        bo.moveCase();
<<<<<<< HEAD
=======
//        AddWeapon w = new AddWeapon("arc", 10);
        AddSpell s = new AddSpell("boule de feu" ,50);
        s.faireAction(bo,bo.perso);
//        w.faireAction(bo, bo.perso);

>>>>>>> 02e3d3d1ded406c95ac20255a1bc9be5a542c4a0
    }

}



 