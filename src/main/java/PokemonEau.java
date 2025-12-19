public class PokemonEau extends Pokemon implements Attaquant {
    String attaque;
    String type;

    public PokemonEau(int niveau, String nom, String attaque) {
        super(niveau, nom);
        this.attaque = attaque;
    }

    @Override
    public void attaquer() {
        System.out.println(nom + " lance une attaque " + attaque);

    }
    @Override
    public void afficherInfos() {
        super.afficherInfos();
    }


}
