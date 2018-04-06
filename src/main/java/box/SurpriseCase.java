package box;


public class SurpriseCase {
    private Surprise surprise;

    public SurpriseCase(Surprise surprise) {
        this.surprise = surprise;
    }

    public Surprise getSurprise() {
        return surprise;
    }

    public void setSurprise(Surprise surprise) {
        this.surprise = surprise;
    }

    public String toString() {
        return "création caisse : \n" + this.surprise;

    }




}
