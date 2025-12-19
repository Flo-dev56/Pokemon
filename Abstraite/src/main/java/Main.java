import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        Animal d = new Chien("noire",15);
        Animal c = new Chat("blanc",5);

        List<Animal> liste = new ArrayList<>();
        liste.add(c);
        liste.add(d);
        for (Animal a: liste){
            a.crier();
            a.boire();
            a.manger();
            a.deplacement();
        }

        System.out.println(liste);


    }
}
