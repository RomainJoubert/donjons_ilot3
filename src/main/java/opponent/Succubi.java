package opponent;

public class Succubi extends Opponent {
// combattent les guerriers - divise la force des armes des guerriers par deux


        public Succubi( String name, int attackLevel ) {
            this.name = name;
            this.attackLevel = attackLevel;

        }

        public int getAttackLevel() {
            return attackLevel;
        }

        public void setAttackLevel(int attackLevel) {
            this.attackLevel = attackLevel;
        }

        public String toString() {
            return "\n son niveau d'attaque ;" +attackLevel ;


        }
}
