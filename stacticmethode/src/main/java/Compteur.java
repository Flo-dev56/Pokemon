public class Compteur {

    static int compteExtraterrestre=0;

    public static void compter(){
        compteExtraterrestre++;
    }

    public static int getCompteExtraterrestre() {
        compter();
        return compteExtraterrestre;
    }

    public static void setCompteExtraterrestre(int compteExtraterrestre) {
        Compteur.compteExtraterrestre = compteExtraterrestre;
    }
}
