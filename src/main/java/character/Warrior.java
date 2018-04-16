package character;

import box.AddShield;
import equipment.Weapon;
import outils.ConnectionBDD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;

public class Warrior extends Character {
    private Weapon weapon;
    private AddShield shield;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public AddShield getShield() {
        return shield;
    }

    public void setShield(AddShield shield) {
        this.shield = shield;
    }

    public String toString() {
        return super.toString() + "\nArme : " + weapon + "\nBouclier : " + shield;

    }

    public void save()
    {
        try {
            Connection connect = ConnectionBDD.ouvrirConnexion();

            Random r = new Random();
            int weaponId = r.nextInt(3) + 1; //permet un tirage entre 0 et 5, on y ajoute +1 pour ne pas tomber sur 0 et obtenir 6

            String requete = "INSERT INTO warrior (id, name, image , life , weapon , shield_level , weapon_id) VALUES (?, ?, ? , ? , ? , ? ,? )";
            //  int nbMaj = stmt.executeUpdate(requete);// affiche le nombre de mises à jour
            PreparedStatement state = connect.prepareStatement(requete);
            state.setInt(1, 18);
            state.setString(2, this.getName());
            state.setString(3, this.getPicture());
            state.setInt(4, this.getLife());
            state.setObject(5, this.getWeapon());
            state.setObject(6, this.getShield());
            state.setInt(7, weaponId);
            state.executeUpdate();

            Statement statement = connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);


            ResultSet result = statement.executeQuery("SELECT warrior.*, weapons.name FROM public.warrior INNER JOIN public.weapons ON weapon_id = weapons.id");


            while (result.next()) { // itérer sur les lignes
                for (int i = 1; i <= 9; i++) { // itérer sur les colonnnes
                    System.out.println(result.getObject(i).toString());
                }
            }

        }
        catch(Exception e)
        {
            System.out.println ("Erreur BDD " + e.getMessage());

        }
    }
}
