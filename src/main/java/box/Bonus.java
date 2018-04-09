package box;

public class Bonus extends Surprise{
    private int cases;
    private int caseNum;

    public Bonus(int cases) {
        this.cases = cases;
    }

    public int getCases() {
        return cases;
    }

    public void setCases(int cases) {
        this.cases = cases;
    }

	public void setCaseNum(Integer integer) {
		this.caseNum = caseNum;
		
	}
	
	public int getCaseNum() {
		return caseNum;
	}


}
