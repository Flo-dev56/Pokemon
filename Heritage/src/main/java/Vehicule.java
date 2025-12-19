public class Vehicule {
    // protected ==> uniquement les enfants peuvent y acceder
    protected String immatriculation;
    protected String marque;
    protected String moteur;
    protected int pruissance;
    protected int nbreRoue;
    protected int poids;

    //generer constructeur


    public Vehicule(String immatriculation, String marque, String moteur, int nbreRoue, int poids, int pruissance) {
        this.immatriculation = immatriculation;
        this.marque = marque;
        this.moteur = moteur;
        this.nbreRoue = nbreRoue;
        this.poids = poids;
        this.pruissance = pruissance;
    }


    //generer getter et setter

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getMoteur() {
        return moteur;
    }

    public void setMoteur(String moteur) {
        this.moteur = moteur;
    }

    public int getNbreRoue() {
        return nbreRoue;
    }

    public void setNbreRoue(int nbreRoue) {
        this.nbreRoue = nbreRoue;
    }

    public int getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

    public int getPruissance() {
        return pruissance;
    }

    public void setPruissance(int pruissance) {
        this.pruissance = pruissance;
    }

    //generer toString


    @Override
    public String toString() {
        return "Vehicule{" +
                "immatriculation='" + immatriculation + '\'' +
                ", marque='" + marque + '\'' +
                ", moteur='" + getMoteur() + '\'' +
                ", pruissance=" + pruissance +
                ", nbreRoue=" + nbreRoue +
                ", poids=" + poids +
                '}';
    }
}
