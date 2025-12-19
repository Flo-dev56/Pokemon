public class Chien extends Animal{
    protected void boire() {
        System.out.println("Le chien boit de l'eau");
    };

    protected void manger(){
        System.out.println("Le chien est carnivore");
    }

    protected void deplacement(){
        System.out.println("Le chien court à 4 pattes");
    }
    protected void crier(){
        System.out.println("Le chien aboie");
    }

    public Chien(String couleur, int poids) {
        super(couleur, poids);
    }

    @Override
    public String toString() {
        return "Chien{" +
                "couleur='" + couleur + '\'' +
                ", poids=" + poids +
                '}';
    }
}

