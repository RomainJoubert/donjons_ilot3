package box;

import java.util.ArrayList;
//import box.Shield;

public class SurpriseCase {


    //----------------méthode pour ajouter un bouclier avec une caisse surprise-----------
    public int addShield() {
        ArrayList<Shield> addShieldListt = new ArrayList<Shield>();
        Shield sh1 = new Shield(5);
        addShieldListt.add(sh1);
        Shield sh2 = new Shield(3);
        addShieldListt.add(sh2);
        Shield sh3 = new Shield(2);
        addShieldListt.add(sh3);

        return addShield();
    }


}
