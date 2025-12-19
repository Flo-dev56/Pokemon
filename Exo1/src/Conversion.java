class Conversion {
    public static void main() {
        double euro;
        double dollars;
        double taux;
        Terminal.ecrireStringln("Le montant en euros ? ");
        euro = Terminal.lireDouble();
        Terminal.ecrireStringln("Saisir le taux de change : ");
        taux= Terminal.lireDouble();
        dollars = (euro * taux);
        Terminal.ecrireString("Le montant en dollars est de : ");
        Terminal.ecrireDoubleln(dollars);
    }
}