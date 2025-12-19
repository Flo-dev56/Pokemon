public class Drone implements ITransporteur{
    double tarifMinute;
    int autonomie;

    public Drone(int autonomie, double tarifMinute) {
        this.autonomie = autonomie;
        this.tarifMinute = tarifMinute;
    }


    @Override
    public void livrer(String adresse) {
        System.out.println("Livraison en drone à l'adresse : " + adresse);

    }

    @Override
    public int delai(double distance) {
        return 0;
    }

    @Override
    public double cout(double distance) {
        return 0;
    }
}
