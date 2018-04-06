package box;

public class Bonus extends Surprise{
    private int cases;

    public Bonus(int cases) {
        this.cases = cases;
    }

    public int getCases() {
        return cases;
    }

    public void setCases(int cases) {
        this.cases = cases;
    }
}
