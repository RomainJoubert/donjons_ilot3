package box;

public class AddWeapon extends Surprise{
    private String weaponName;
    private int weaponAttackLevel;
    private int attackDragon;
    private int attackSuccubus;
    private int attackWizzard;


    public AddWeapon(String weaponName,int weaponAttackLevel,int attackDragon, int attackSuccubus, int attackWizzard ) {
        this.weaponName = weaponName;
        this.weaponAttackLevel = weaponAttackLevel;
        this.attackDragon =attackDragon;
        this.attackSuccubus =  attackSuccubus;
        this.attackWizzard = attackWizzard;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public int weaponAttackLevel() {
        return weaponAttackLevel;
    }

    public void weaponAttackLevel(int weaponAttackLevel) {
        this.weaponAttackLevel = weaponAttackLevel;
    }

    public String toString() {
        return "nouvelle arme: " + this.weaponName + "\nniveau de l'arme : " + this.weaponAttackLevel;

    }

}
