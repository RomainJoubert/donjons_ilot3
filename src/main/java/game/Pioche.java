package game;

import java.util.ArrayList;
import java.util.Random;

public class Pioche {
        private ArrayList<Integer> nombres=new ArrayList<Integer>();
        private int nb;

        // Constructeur de l'objet
        public  Pioche(int nb)
        {
            this.nb=nb; // nombre d'éléments dans la liste
            setTableau(); // On appelle la fonction qui rempli la liste des éléments à tirer au sort
        }

        private void setTableau()
        {
            // On remplit le tableau "nombres" de 1 à nb
            for(int i=1;i<=this.nb;i++) {nombres.add(i);}
        }

        // Méthode pour ne pas tirer au sort les même nombres plusieurs fois de suite :
        // 1) on tire un nombre au hasard parmi ceux présents dans la liste
        // 2) on retire ce nombre de la liste
        //    ainsi, à chaque tirage, la liste comprend n-1 éléments et on piochera parmi n-1 élements
        // 3) si la liste est vide, on peut éventuellement la réinitialiser

        public Integer getPif()
        {
            if(nombres.size()==0) {setTableau();} // (3)
            int i=pif(0,nombres.size()-1); // (1)
            int retour=nombres.get(i);
            nombres.remove(i); // (2)
            return retour;
        }

        // Tirage au sort
        // ENTREE : la valeur min et la valeur max
        // SORTIE : un nombre entier compris entre min et max
        private int pif(int min ,int max)
        { min = 0;
        max = 27;
            Random rand=new Random();
            return rand.nextInt((max - min) + 1) + 1;
        }
    }

