import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Stock {
    private List <Produit> listeProduit;

    public Stock(List<Produit> listeProduit) {
        this.listeProduit = listeProduit;
    }

    public List<Produit> getListeProduit() {
        return listeProduit;
    }

    public void setListeProduit(List<Produit> listeProduit) {
        this.listeProduit = listeProduit;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "listeProduit=" + listeProduit +
                '}';
    }

    public void ajoutProduit (Produit p) {
        if (p != null) {
            listeProduit.add(p);
            Collections.sort(listeProduit, Comparator.comparingInt(Produit::getReference));
        }
    }
    // Recherche et renvoie le prix d'un produit en fonction de sa référence.
    // Renvoie -1 si le référence n'est pas dans le stock.
    public double rechercheParReference(int ref){
        for (Produit p : this.listeProduit) {
            if (p.getReference() == ref) {
                System.out.println("Prix trouvé pour le produit n°" + ref +
                        " : " + p.getPrixHt());
                return p.getPrixHt();
            }
        }System.out.println("Le produit n°" + ref + " n'existe pas.");
        return -1.0; //pour retourner un double. -1 pour montrer qu'il y a une erreur


            }



    }


}

