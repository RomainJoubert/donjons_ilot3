package box;
import equipment.Weapon;


public class SurpriseCase {
    private Surprise surprise;
    private int caseNum;

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
        return "Tu es tombé sur la case surprise" + surprise ;
    }
}
