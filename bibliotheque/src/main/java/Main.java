public class Main {
    static void main() {
        Livre l = new Livre("Kafka", "Folio", "La metamorphorse");
        Livre l2 = new Livre("Zola", "Hachette", "Germinal");
        System.out.println(l);
        System.out.println(l2);

        Bibliotheque b1 = new Bibliotheque ("Roman");

        b1.ajoutLivre(l2);
        b1.ajoutLivre(l);
        System.out.println(b1);
    }
}
