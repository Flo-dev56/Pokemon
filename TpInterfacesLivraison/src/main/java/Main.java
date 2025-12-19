public class Main {
    static void main() {
        ITransporteur c = new Camion(3.5,100);
        ITransporteur r = new RobotAutonome(45.50,20);
        ITransporteur d = new Drone(240,3);
        Livraisons.traiterLivraison(c,650,"10 rue de la paix, 56000 Vannes");
        Livraisons.traiterLivraison(r,650,"10 rue de la paix, 56000 Vannes");
        Livraisons.traiterLivraison(d,650,"10 rue de la paix, 56000 Vannes");

    }
}
