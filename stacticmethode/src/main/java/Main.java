import java.sql.SQLOutput;
import java.util.ListResourceBundle;

public class Main {
    static void main() {
    Personne p  = new Personne("Florent", "Pagny");
        System.out.println();

    //comme la classe est statique , pas besoin de new Extraterrestre
        Extraterrestre.setIdentifiant("1234FZFZFE");
        System.out.println(Extraterrestre.getIdentifiant());
        System.out.println(Compteur.getCompteExtraterrestre());
        System.out.println(Compteur.getCompteExtraterrestre());
        System.out.println(Compteur.getCompteExtraterrestre());
        System.out.println(Compteur.getCompteExtraterrestre());
    }
}
