package opponent;

public class Wizzard extends Opponent {
	private int caseNum;
	
    public int getCaseNum() {
		return caseNum;
	}

	public void setCaseNum(int caseNum) {
		this.caseNum = caseNum;
	}

	public Wizzard(int attackLevel) {
        this.attackLevel = attackLevel;
    }

    public int getAttackLevel() {
        return attackLevel;
    }

    public void setAttackLevel(int attackLevel) {
        this.attackLevel = attackLevel;
    }

    public String toString() {
        return "\n son niveau d'attaque ;" +attackLevel ;

    }
// combattent les magiciens uniquement
}
