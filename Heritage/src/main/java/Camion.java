import java.time.LocalDate;

public class Camion extends Vehicule {
    private int tailleRemorque;
    private boolean hayon;
    private LocalDate dateValidationFimo;

    //generer constructeur

    public Camion(String immatriculation, String marque, String moteur, int nbreRoue, int poids, int pruissance, LocalDate dateValidationFimo, boolean hayon, int tailleRemorque) {
        super(immatriculation, marque, moteur, nbreRoue, poids, pruissance);
        this.dateValidationFimo = dateValidationFimo;
        this.hayon = hayon;
        this.tailleRemorque = tailleRemorque;
    }

    //generer getter et setter

    public LocalDate getDateValidationFimo() {
        return dateValidationFimo;
    }

    public void setDateValidationFimo(LocalDate dateValidationFimo) {
        this.dateValidationFimo = dateValidationFimo;
    }

    public boolean isHayon() {
        return hayon;
    }

    public void setHayon(boolean hayon) {
        this.hayon = hayon;
    }

    public int getTailleRemorque() {
        return tailleRemorque;
    }

    public void setTailleRemorque(int tailleRemorque) {
        this.tailleRemorque = tailleRemorque;
    }

    //generer toString()

    @Override
    public String toString() {
        return "Camion{" +
                "dateValidationFimo=" + dateValidationFimo +
                ", tailleRemorque=" + tailleRemorque +
                ", hayon=" + hayon +
                ", immatriculation='" + immatriculation + '\'' +
                ", marque='" + marque + '\'' +
                ", moteur='" + moteur + '\'' +
                ", nbreRoue=" + nbreRoue +
                ", poids=" + poids +
                ", pruissance=" + pruissance +
                '}';
    }
}
