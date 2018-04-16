package outils;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionBDD {

    public static Connection ouvrirConnexion()
    {
        try {
            Class.forName("org.postgresql.Driver");

            String url = "jdbc:postgresql://localhost:5432/donjons";
            String user = "postgres";
            String passwd = "superutilisateur";

            Connection connect = DriverManager.getConnection(url, user, passwd);
            System.out.println("Connexion effective !");
            return connect;
        }
        catch(Exception e) {
            System.out.println ("Erreur BDD" + e.getMessage());
            return null;
        }
    }
}
