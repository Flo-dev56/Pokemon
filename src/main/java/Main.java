import java.util.ArrayList;

public class Main {
    static void main (){
        Pokemon Salameche = new PokemonFeu(23,"Salamèche","lance flamme");
        Pokemon Carapuce = new PokemonEau(3, "Carapuce", "canon à eau", "Eau");



        ArrayList <Pokemon> listeP = new ArrayList<>();
        listeP.add(Salameche);
        listeP.add(Carapuce);

        for (Pokemon p :listeP){
            p.afficherInfos();
            p.attaquer();
        }



    }
}
