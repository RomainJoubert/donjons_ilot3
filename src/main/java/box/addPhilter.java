package box;

public class addPhilter extends Surprise {
    private int philterLevel;

    public addPhilter(int philterLevel) {
        this.philterLevel = philterLevel;
    }

    public int getPhilterLevel() {
        return philterLevel;
    }

    public void setPhilterLevel(int philterLevel) {
        this.philterLevel = philterLevel;
    }

    @Override
    public String toString() {
        return "Niveau du philtre gagné : " + philterLevel;
    }
}
