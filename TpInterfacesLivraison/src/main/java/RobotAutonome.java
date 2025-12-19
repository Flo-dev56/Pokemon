public class RobotAutonome implements ITransporteur{
    double tarifHoraire;
    int vitesse;

    public RobotAutonome(double tarifHoraire, int vitesse) {
        this.tarifHoraire = tarifHoraire;
        this.vitesse = vitesse;
    }

    @Override
    public void livrer(String adresse) {
        System.out.println("Livraison en robot autonome à l'adresse : " + adresse);
    }

    @Override
    public int delai(double distance) {
        return (int)(distance /vitesse * 60);
    }

    @Override
    public double cout( double distance) {
        return  (delai ( distance)/ 60 * tarifHoraire);
    }
}

