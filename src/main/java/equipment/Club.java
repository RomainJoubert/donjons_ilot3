package equipment;

public class Club extends Weapon {
    private int clubLevel;

    public Club(String name,int clubLevel) {
        this.clubLevel = clubLevel;
        this.name = name;
    }

    public int getClubLevel() {
        return clubLevel;
    }

    public void setClubLevel(int clubLevel) {
        this.clubLevel = clubLevel;
    }

    @Override
    public String toString() {
        return "Massue de force d'attaque de " + clubLevel ;
    }
}

