import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {
    String nom;
    List <Livre> Listelivre;

    public Bibliotheque(String nom) {
        this.nom = nom;
        Listelivre = new ArrayList<>();
    }


    public List<Livre> getListelivre() {
        return Listelivre;
    }

    public void setListelivre(List<Livre> listelivre) {
        Listelivre = listelivre;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Bibliotheque{" +
                "Listelivre=" + Listelivre +
                ", nom='" + nom + '\'' +
                '}';
    }

    public void ajoutLivre (Livre l) {
        Listelivre.add(l);
    }
}


