public class Livre {

    private String titre;
    private String auteur;
    private String editeur;

    public Livre(String auteur, String editeur, String titre) {
        this.auteur = auteur;
        this.editeur = editeur;
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getEditeur() {
        return editeur;
    }

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "auteur='" + auteur + '\'' +
                ", titre='" + titre + '\'' +
                ", editeur='" + editeur + '\'' +
                '}';
    }
}
