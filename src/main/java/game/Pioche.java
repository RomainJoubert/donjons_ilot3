package game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Pioche {
	
	private ArrayList<Integer> listID = new ArrayList<Integer>(); 
	private int taille_tableau = 64; 
	
	public Pioche() {
		for (int i=1; i<= taille_tableau; i++) {
			listID.add(i); 
		}
		Collections.shuffle(listID);
	}

	public ArrayList<Integer> getListID() {
		return listID;
	}

	public void setListID(ArrayList<Integer> listID) {
		this.listID = listID;
	}
	
}

