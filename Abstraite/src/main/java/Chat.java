public class Chat extends Animal {


    protected void boire() {
            System.out.println("Le chat boit de l'eau");
    };

    protected void manger(){
        System.out.println("Le chat est carnivore");
    }

    @Override
    public String toString() {
        return "Chat{" +
                "couleur='" + couleur + '\'' +
                ", poids=" + poids +
                '}';
    }

    protected void deplacement(){
        System.out.println("Le chat court à 4 pattes");
    }
    protected void crier(){
        System.out.println("Le chat miaule");
    }

    public Chat(String couleur, int poids) {
        super(couleur, poids);
    }
}
