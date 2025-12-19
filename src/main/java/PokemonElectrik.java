public class PokemonElectrik extends Pokemon implements Attaquant {
    String attaque;

    public PokemonElectrik(int niveau, String nom, String attaque) {
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

        ;
    }
}


