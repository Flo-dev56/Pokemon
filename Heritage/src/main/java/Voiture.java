public class Voiture extends Vehicule {
    //extends pour heriter de la classe vehicule

    private int siegeAuto;
    private boolean coffreDeToit;

    //generer le constructeur (generate.. constructor)

    public Voiture(String immatriculation, String marque, String moteur, int nbreRoue, int poids, int pruissance, boolean coffreDeToit, int siegeAuto) {
        super(immatriculation, marque, moteur, nbreRoue, poids, pruissance);
        this.coffreDeToit = coffreDeToit;
        this.siegeAuto = siegeAuto;
    }

    //generer getter et setter


    public boolean isCoffreDeToit() {
        return coffreDeToit;
    }

    public void setCoffreDeToit(boolean coffreDeToit) {
        this.coffreDeToit = coffreDeToit;
    }

    public int getSiegeAuto() {
        return siegeAuto;
    }

    public void setSiegeAuto(int siegeAuto) {
        this.siegeAuto = siegeAuto;
    }
    //generer method tostring()

    @Override
    public String toString() {
        return "Voiture{" +
                "nbreRoue=" + nbreRoue +
                ", coffreDeToit=" + coffreDeToit +
                ", siegeAuto=" + siegeAuto +
                ", immatriculation='" + immatriculation + '\'' +
                ", marque='" + marque + '\'' +
                ", moteur='" + moteur + '\'' +
                ", poids=" + poids +
                ", pruissance=" + pruissance +
                '}';
    }
}
