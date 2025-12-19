import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Personne {
    int id;
    String prenom;
    String nom;
    String email;
    LocalDate dateNaissance;
    Adresse adresse;
    List<Voiture> listeVoiture;




    public Personne(LocalDate dateNaissance, String email, String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.dateNaissance = dateNaissance;
    }

    public List<Voiture> getListeVoiture() {
        return listeVoiture;
    }

    public void setListeVoiture(List<Voiture> listeVoiture) {
        this.listeVoiture = listeVoiture;
    }

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "adresse=" + adresse +
                ", id=" + id +
                ", prenom='" + prenom + '\'' +
                ", nom='" + nom + '\'' +
                ", email='" + email + '\'' +
                ", dateNaissance=" + dateNaissance +
                ", listeVoiture=" + listeVoiture +
                '}';
    }
}

