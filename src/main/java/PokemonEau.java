public class PokemonEau extends Pokemon {
    String attaque;

    public PokemonEau(int niveau, String nom, String attaque) {
        super(niveau, nom);
        this.attaque = attaque;
    }

    @Override
    public void attaquer() {
        System.out.println(nom + " lance une attaque " + attaque);

    }
}
