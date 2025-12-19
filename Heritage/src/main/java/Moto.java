public class Moto extends Vehicule {
    private boolean casque;
    private boolean sidecar;

    //generer constructeur

    public Moto(String immatriculation, String marque, String moteur, int nbreRoue, int poids, int pruissance, boolean casque, boolean sidecar) {
        super(immatriculation, marque, moteur, nbreRoue, poids, pruissance);
        this.casque = casque;
        this.sidecar = sidecar;
    }

    //generer getter et setter

    public boolean isCasque() {
        return casque;
    }

    public void setCasque(boolean casque) {
        this.casque = casque;
    }

    public boolean isSidecar() {
        return sidecar;
    }

    public void setSidecar(boolean sidecar) {
        this.sidecar = sidecar;
    }

    //generer method toString();

    @Override
    public String toString() {
        return "Moto{" +
                "casque=" + casque +
                ", sidecar=" + sidecar +
                ", immatriculation='" + immatriculation + '\'' +
                ", marque='" + marque + '\'' +
                ", moteur='" + moteur + '\'' +
                ", nbreRoue=" + nbreRoue +
                ", poids=" + poids +
                ", pruissance=" + pruissance +
                '}';
    }
}
