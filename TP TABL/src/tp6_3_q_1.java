import javax.xml.crypto.dsig.spec.RSAPSSParameterSpec;

public class tp6_3_q_1 {
    public static String affichageTab(int[] tableau) {
        String res = "";
        for (int i = 0; i < tableau.length; i++) {
            res = res + tableau[i] + " - ";
        }
        return res;
    }

    static void main(String[] args) {
        int[][] tab = new int[5][4];
        Terminal.ecrireStringln(" Lignes:             Colonnes:\n0. andré               0. twingo\n1. ingemar             1. clio\n2. jean-jérôme         2. mégane\n3. cindy               3. velsatis\n4. joey");
//        Terminal.ecrireString("Saisir n° vendeur (1,2,3 etc) :  ");
//        int vendeur = Terminal.lireInt() - 1;
//        Terminal.ecrireString("Saisir n° modèle : ");
//        int modele = Terminal.lireInt() - 1;
//        Terminal.ecrireString("vendeur :" + vendeur + " modele : " + modele );

        for (int c = 0; c < 4; c++) { //colonne
            for (int l = 0; l < 5; l++) { //ligne

            }

        }
    }
}