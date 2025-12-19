import java.util.Random;

public class EntierRandom {
    static void main() {

        //déclaration d'un objet de type random pour générer un nombre aléatoire entre 1 et 30'
        Random r = new Random();
        //on initialise la variable
        int nbreAleatoire = 0;
        int nbrePlusPetit = 30;
        // TODO faire une boucle pour afficher 20 entiers aléatoire
        for (int i = 0; i < 20; i++) {
            //on récupère dans la variable nbreAleatoire
            //un nombre entre 1 et 30
            nbreAleatoire = r.nextInt(1, 30);
            //affichage du nombre
            Terminal.ecrireInt(nbreAleatoire);
            Terminal.sautDeLigne();
            if (nbrePlusPetit > nbreAleatoire) {
                nbrePlusPetit = nbreAleatoire;
            }
        }
        Terminal.ecrireStringln("le nombre plus petit :" + nbrePlusPetit);
        //exercice 5 TP

        int fact=0;
        long total =1;
        Terminal.ecrireStringln("Saisir un nombre entier :");
        int facto=Terminal.lireInt();
        for (int i=1;i<facto+1;i++){
            total=total*i;
        }
        Terminal.ecrireStringln("Valeur facto de "+ facto+ " est de " + total );

    }
}

