package character;

import box.AddPhilter;
import equipment.Spell;
import outils.ConnectionBDD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;

public class Magician extends Character {
	private Spell spell;

	private AddPhilter philter;

    public Spell getSpell() {
        return spell;
    }

    public void setSpell(Spell spell) {
        this.spell = spell;
    }

    public AddPhilter getPhilter() {
        return philter;
    }

    public void setPhilter(AddPhilter philter) {
        this.philter = philter;
    }

    public String toString() {
        return super.toString() + "\nSort : " + spell + "\nPhiltre : " + philter;
    }

    public void save()
    {
        try {
            Connection connect = ConnectionBDD.ouvrirConnexion();

            Random r = new Random();
            int spellId = r.nextInt(3) + 1; //permet un tirage entre 0 et 5, on y ajoute +1 pour ne pas tomber sur 0 et obtenir 6

            String requete = "INSERT INTO magician (id, name, image , life , sort , philter , spell_id) VALUES (?, ?, ? , ? , ? , ? ,?)";
            //  int nbMaj = stmt.executeUpdate(requete);// affiche le nombre de mises à jour
            PreparedStatement state = connect.prepareStatement(requete);
            state.setInt(1, 18);
            state.setString(2, this.getName());
            state.setString(3, this.getPicture());
            state.setInt(4, this.getLife());
            state.setObject(5, this.getSpell());
            state.setObject(6, this.getPhilter());
            state.setInt(7, spellId);
            state.executeUpdate();

            Statement statement = connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);


            ResultSet result = statement.executeQuery("SELECT magician.*, spells.name FROM public.magician INNER JOIN public.spells ON spell_id = spells.id");


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
