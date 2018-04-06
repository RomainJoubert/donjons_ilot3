package box;


import java.util.ArrayList;



public class SurpriseCase {
    private Surprise surprise;

    public SurpriseCase(Surprise surprise) {
        this.surprise = surprise;
    }

    public Surprise getSurprise() {
        return surprise;
    }

    public void setSurprise(Surprise surprise) {
        this.surprise = surprise;
    }

    public String toString() {
        return "création caisse : \n" + this.surprise;

    }


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
