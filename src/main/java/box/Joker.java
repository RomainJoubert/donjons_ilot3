package box;

public class Joker extends Surprise{
    private int life;
    private int CaseNum;

    public Joker(int life) {
        this.life = life;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

	public void setCaseNum(Integer integer) {
		this.CaseNum = CaseNum;
		
	}
	public int getCaseNum() {
		return CaseNum;
	}
}
