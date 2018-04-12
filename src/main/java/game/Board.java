package game;

import java.util.ArrayList;
import java.util.Collections;

public class Board extends Case{

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

}
