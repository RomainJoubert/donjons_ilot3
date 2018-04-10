package opponent;

public class Dragon extends Opponent {
// combattent guerriers et magiciens. Plus ils sont vieux et plus leur force d'attaque est élevée.
    private int age;
    private int caseNum;

    public int getCaseNum() {
		return caseNum;
	}

	public void setCaseNum(int caseNum) {
		this.caseNum = caseNum;
	}

	public Dragon(int dragonAge , int attackLevel) {
        this.age = dragonAge;
        this.attackLevel = attackLevel;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int dragonAge) {
        this.age = dragonAge;
    }

    public String toString() {
        return "\n son âge ;" +age ;


    }
}
