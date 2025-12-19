public class tp6_3_q_2 {
    public static String affichageTab(int[] tableau) {
        String res = "";
        for (int i = 0; i < tableau.length; i++) {
            res = res + tableau[i] + " - ";
        }
        return res;
    }

    static void main() {
//      int[][] tab = new int[5][4];
        int [][] tab = {
                {2,3,4,5},
                {4,5,6,6},
                {5,5,6,3},
                
         };

        double[][] prix ={ {10000, 20000},{4000, 5000} }; // Exemple pour déclarer tableau a double entrée /!\ ne pas utiliser
        Terminal.ecrireStringln(" Lignes:             Colonnes:\n0. andré               0. twingo\n1. ingemar             1. clio\n2. jean-jérôme         2. mégane\n3. cindy               3. velsatis\n4. joey");
//        Terminal.ecrireString("Saisir n° vendeur (1,2,3 etc) :  ");
//        int vendeur = Terminal.lireInt() - 1;
//        Terminal.ecrireString("Saisir n° modèle : ");
//        int modele = Terminal.lireInt() - 1;
//        Terminal.ecrireString("vendeur :" + vendeur + " modele : " + modele );
        int nbVentes = 0;
        for (int c = 0; c < 4; c++) { //colonne
            for (int l = 0; l < 5; l++) { //ligne
                nbVentes = nbVentes + tab[l][c];
            }
        }

    }
}
