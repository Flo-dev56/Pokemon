public class Livraisons {
    public static void traiterLivraison (ITransporteur t, double distance, String adresse){
        System.out.println("cout :" + t.cout(distance) + " euros");
        System.out.println("delai :" + t.delai(distance) + " heures");
        t.livrer(adresse);
    }

}
