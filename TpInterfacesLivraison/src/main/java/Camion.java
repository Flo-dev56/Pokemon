public class Camion implements ITransporteur{

    double tarifKM;
    int vitesseMoyenne;

    public Camion(double tarifKM, int vitesseMoyenne) {
        this.tarifKM = tarifKM;
        this.vitesseMoyenne = vitesseMoyenne;
    }

    @Override
    public int delai(double distance) {
        return (int) (distance/ vitesseMoyenne * 60) ;
    }

    @Override
    public void livrer(String adresse) {
        System.out.println("Livraison en camion à l'adresse : " + adresse);
    }

    @Override
    public double cout(double distance) {
        return distance * tarifKM;
    }
}
