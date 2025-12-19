public class Produit {
    private String nom;
    private int reference;
    private double prixHt;

    public Produit(String nom, double prixHt, int reference) {
        this.nom = nom;
        this.prixHt = prixHt;
        this.reference = reference;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrixHt() {
        return prixHt;
    }

    public void setPrixHt(double prixHt) {
        this.prixHt = prixHt;
    }

    public int getReference() {
        return reference;
    }

    public void setReference(int reference) {
        this.reference = reference;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "nom='" + nom + '\'' +
                ", reference=" + reference +
                ", prixHt=" + prixHt +
                '}';
    }


    }

}
