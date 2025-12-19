public class Employe {
    protected String nom;
    protected String prenom;
    protected String numSecu;


    public Employe(String nom,String prenom, String numSecu ) {
        this.nom = nom;
        this.prenom = prenom;
        this.numSecu = numSecu;



    }
    protected double calculSalaireBrut(){
        return 1200;
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNumSecu() {
        return numSecu;
    }

    public void setNumSecu(String numSecu) {
        this.numSecu = numSecu;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", numSecu='" + numSecu + '\'' +
                '}';
    }
}
