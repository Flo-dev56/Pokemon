public class exemple_cours_fonctionsEtProcédures {
    public static String affichageTab(int []tableau){
        String res="";
        for (int i = 0; i < tableau.length; i++) {
            res = res + tableau[i] + " - ";
        }
        return res;
    }
    static void main() {
        int[] tab = {12, 15, 13, 10, 8, 9, 13, 14};
        Terminal.ecrireStringln(affichageTab(tab));
        Terminal.ecrireString("Saisir l'indice à modifier : ");
        int indice = Terminal.lireInt();
        Terminal.ecrireString("Saisir la valeur à modifier : ");
        int valeur = Terminal.lireInt();
        Terminal.ecrireStringln(indice + " ; " + valeur);

        if( indice< 0 || indice>= tab.length){
            Terminal.ecrireString("L'indice doit être supérieur à zéro ou inférieur à la taille du tableau");
        }else{
            tab[indice] = valeur;
        }

        Terminal.ecrireString(affichageTab(tab));





        }



    }




