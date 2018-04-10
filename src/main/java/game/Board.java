package game;

public class Board {
    private String CaseType;
    private int cases;

    public Board(int cases) {
        this.cases = cases;
    }

    public int getCases() {
        return cases;
    }

    public void setCases(int cases) {
        this.cases = cases;
    }

    public void setCaseType(String caseType) {
        CaseType = caseType;
    }

    public String getCaseType() {
        return CaseType;
    }

}
