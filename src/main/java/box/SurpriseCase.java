package box;
import equipment.Weapon;
import game.event;
import opponent.Opponent;


public class SurpriseCase extends event {
    private Surprise surprise;
    private Opponent opponent;
     int caseNum;

    public int getCaseNum() {
		return caseNum;
	}

	public void setCaseNum(int caseNum) {
		this.caseNum = caseNum;
	}

	public SurpriseCase(Surprise surprise) {
        this.surprise = surprise;
    }

    public Surprise getSurprise() {
        return surprise;
    }

    public void setSurprise(Surprise surprise) {
        this.surprise = surprise;
    }


    @Override
    public String toString() {
        return "Tu es tombé sur une case surprise " + surprise ;
    }
}
