public class TP4_2exo3_2_1 {
    static void main() {
        Terminal.ecrireString("Saisir la taille du carré :");
        int taille= Terminal.lireInt();
        String etoile ="" ;
        int i,p;
        for(i=0;i<taille;i++){
            for(p=0; p<taille;p++){
                etoile ="*" + etoile;
            }
            Terminal.ecrireStringln(etoile);
            etoile=""; //reinitialiser la variable
        }

    }
}
