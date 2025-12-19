public class exo5 {
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
        Terminal.ecrireString("Saisir l'indice 1 à permuter : ");
        int indice = Terminal.lireInt();
        Terminal.ecrireString("Saisir l'indice 2 à permuter : ");
        int indice2 = Terminal.lireInt();
        Terminal.ecrireStringln(indice + " ; " + indice2);
        int n = tab[indice];


        if( indice< 0 || indice>= tab.length){
            Terminal.ecrireString("L'indice doit être supérieur à zéro ou inférieur à la taille du tableau");
        }else{
            tab[indice] = tab[indice2];
            tab[indice2] = n;

        }

        Terminal.ecrireString(affichageTab(tab));





    }



}