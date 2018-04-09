package box;

public class Malus extends Surprise{
    private int cases;
    private int CaseNum;

    public Malus(int cases) {
        this.cases = cases;
    }

    public int getCases() {
        return cases;
    }

    public void setCases(int cases) {
        this.cases = cases;
    }

	public void setCaseNum(Integer integer) {
		this.CaseNum = CaseNum;
		
	}
	
	public int getCaseNum() {
		return CaseNum;
	}
}
