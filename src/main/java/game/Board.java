package game;

import box.*;
import opponent.Dragon;
import opponent.Succubi;
import opponent.Wizzard;
import java.util.Collections;
import java.util.ArrayList;


public class Board extends Case {
    private Pioche maListe = new Pioche();
    private static Board board = new Board();
    //---------------cases surprises----------------
    private SurpriseCase w4 = new SurpriseCase(new AddWeapon("bombe", 100));
    private SurpriseCase w5 = new SurpriseCase(new AddWeapon("hache", 25));
    private SurpriseCase sp1 = new SurpriseCase(new AddSpell("Boule de feu", 50));
    private SurpriseCase sp2 = new SurpriseCase(new AddSpell("Lévitation", 25));
    private SurpriseCase sh1 = new SurpriseCase(new AddShield(5));
    private SurpriseCase sh2 = new SurpriseCase(new AddShield(3));
    private SurpriseCase sh3 = new SurpriseCase(new AddShield(2));
    private SurpriseCase ph1 = new SurpriseCase(new AddPhilter(5));
    private SurpriseCase ph2 = new SurpriseCase(new AddPhilter(3));
    private SurpriseCase ph3 = new SurpriseCase(new AddPhilter(2));
    private SurpriseCase b1 = new SurpriseCase(new Bonus());
    private SurpriseCase m1 = new SurpriseCase(new Malus());
    private SurpriseCase m2 = new SurpriseCase(new Malus());
    private SurpriseCase j1 = new SurpriseCase(new Joker25());
    private SurpriseCase j2 = new SurpriseCase(new Joker50());

    //-----------ennemis--------------
    private SurpriseCase drag1 = new SurpriseCase(new Dragon(80,80));
    private SurpriseCase drag2 = new SurpriseCase(new Dragon(60,60));
    private SurpriseCase drag3 = new SurpriseCase(new Dragon(40,40));
    private SurpriseCase drag4 = new SurpriseCase(new Dragon(30,30));
    private SurpriseCase drag5 = new SurpriseCase(new Dragon(20,20));
    private SurpriseCase drag6 = new SurpriseCase(new Dragon(15,15));
    private SurpriseCase wizz1 = new SurpriseCase(new Wizzard(75));
    private SurpriseCase wizz2 = new SurpriseCase(new Wizzard(50));
    private SurpriseCase wizz3 = new SurpriseCase(new Wizzard(25));
    private SurpriseCase wizz4 = new SurpriseCase(new Wizzard(15));
    private SurpriseCase suc1 = new SurpriseCase(new Succubi("Cruella", 75));
    private SurpriseCase suc2 = new SurpriseCase(new Succubi("Raiponce", 50));
    private SurpriseCase suc3 = new SurpriseCase(new Succubi("Cendrillon", 25));
    private SurpriseCase suc4 = new SurpriseCase(new Succubi("Elsa", 15));


	private ArrayList<Case> cases = new ArrayList<Case>();


	public ArrayList<Case> getCases() {
		return cases;
	}

	public void setCases(ArrayList<Case> cases) {
		this.cases = cases;
	}

	public Board() {
		for (int i=1; i<= 64; i++) {
			cases.add(new Case());
		}
	}
    public void draw() {
        for (int i = 0; i < 29; i++) {
            System.out.println(maListe.getListID().get(i));
        }
    }

    public void putCaseSurprise() {
        int i;
        ArrayList<SurpriseCase> surpriseList = new ArrayList<SurpriseCase>();
        w4.setCaseNum(maListe.getListID().get(15));
        board.getCases().get(maListe.getListID().get(15)).setEv(w4);
        surpriseList.add(w4);
        w5.setCaseNum(maListe.getListID().get(16));
        board.getCases().get(maListe.getListID().get(16)).setEv(w5);
        surpriseList.add(w5);
        sp1.setCaseNum(maListe.getListID().get(23));
        board.getCases().get(maListe.getListID().get(23)).setEv(sp1);
        surpriseList.add(sp1);
        sp2.setCaseNum(maListe.getListID().get(24));
        board.getCases().get(maListe.getListID().get(24)).setEv(sp2);
        surpriseList.add(sp2);
        sh1.setCaseNum(maListe.getListID().get(17));
        board.getCases().get(maListe.getListID().get(17)).setEv(sh1);
        surpriseList.add(sh1);
        sh2.setCaseNum(maListe.getListID().get(18));
        board.getCases().get(maListe.getListID().get(18)).setEv(sh2);
        surpriseList.add(sh2);
        sh3.setCaseNum(maListe.getListID().get(19));
        board.getCases().get(maListe.getListID().get(19)).setEv(sh3);
        surpriseList.add(sh3);
        ph1.setCaseNum(maListe.getListID().get(20));
        board.getCases().get(maListe.getListID().get(20)).setEv(ph1);
        surpriseList.add(ph1);
        ph2.setCaseNum(maListe.getListID().get(21));
        board.getCases().get(maListe.getListID().get(21)).setEv(ph2);
        surpriseList.add(ph2);
        ph3.setCaseNum(maListe.getListID().get(22));
        board.getCases().get(maListe.getListID().get(22)).setEv(ph3);
        surpriseList.add(ph3);
        b1.setCaseNum(maListe.getListID().get(25));
        board.getCases().get(maListe.getListID().get(25)).setEv(b1);
        surpriseList.add(b1);
        m1.setCaseNum(maListe.getListID().get(26));
        board.getCases().get(maListe.getListID().get(26)).setEv(m1);
        surpriseList.add(m1);
        m2.setCaseNum(maListe.getListID().get(27));
        board.getCases().get(maListe.getListID().get(26)).setEv(m2);
        surpriseList.add(m2);
        j1.setCaseNum(maListe.getListID().get(28));
        board.getCases().get(maListe.getListID().get(28)).setEv(j1);
        surpriseList.add(j1);
        j2.setCaseNum(maListe.getListID().get(29));
        board.getCases().get(maListe.getListID().get(29)).setEv(j2);
        surpriseList.add(j2);
        suc1.setCaseNum(maListe.getListID().get(1));
        board.getCases().get(maListe.getListID().get(1)).setEv(suc1);
        surpriseList.add(suc1);
        suc2.setCaseNum(maListe.getListID().get(2));
        board.getCases().get(maListe.getListID().get(2)).setEv(suc2);
        surpriseList.add(suc2);
        suc3.setCaseNum(maListe.getListID().get(3));
        board.getCases().get(maListe.getListID().get(3)).setEv(suc3);
        surpriseList.add(suc3);
        suc4.setCaseNum(maListe.getListID().get(4));
        board.getCases().get(maListe.getListID().get(4)).setEv(suc4);
        surpriseList.add(suc4);
        drag1.setCaseNum(maListe.getListID().get(5));
        board.getCases().get(maListe.getListID().get(5)).setEv(drag1);
        surpriseList.add(drag1);
        drag2.setCaseNum(maListe.getListID().get(6));
        board.getCases().get(maListe.getListID().get(6)).setEv(drag2);
        surpriseList.add(drag2);
        drag3.setCaseNum(maListe.getListID().get(7));
        board.getCases().get(maListe.getListID().get(7)).setEv(drag3);
        surpriseList.add(drag1);
        drag4.setCaseNum(maListe.getListID().get(8));
        board.getCases().get(maListe.getListID().get(8)).setEv(drag4);
        surpriseList.add(drag4);
        drag5.setCaseNum(maListe.getListID().get(9));
        board.getCases().get(maListe.getListID().get(9)).setEv(drag5);
        surpriseList.add(drag5);
        drag6.setCaseNum(maListe.getListID().get(10));
        board.getCases().get(maListe.getListID().get(10)).setEv(drag6);
        surpriseList.add(drag6);
        wizz1.setCaseNum(maListe.getListID().get(11));
        board.getCases().get(maListe.getListID().get(11)).setEv(wizz1);
        surpriseList.add(wizz1);
        wizz2.setCaseNum(maListe.getListID().get(12));
        board.getCases().get(maListe.getListID().get(12)).setEv(wizz2);
        surpriseList.add(wizz2);
        wizz3.setCaseNum(maListe.getListID().get(13));
        board.getCases().get(maListe.getListID().get(13)).setEv(wizz3);
        surpriseList.add(wizz3);
        wizz4.setCaseNum(maListe.getListID().get(14));
        board.getCases().get(maListe.getListID().get(14)).setEv(wizz4);
        surpriseList.add(wizz4);

        for (i = 0; i < surpriseList.size(); i++) {
            surpriseList.get(i);
            System.out.println(surpriseList.get(i) + " \nnuméro de case : " + surpriseList.get(i).getCaseNum());
        }

    }



}
