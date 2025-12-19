import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {



    Vehicule v = new Voiture("132-df-45","BMW","thermique",4,1, 8,false,1);
    Vehicule c = new Camion("234-fd-321", "Scania","thermique",6,18,12,
            LocalDate.of(2025,12,25),true,3);
    Vehicule m = new Moto("324-ui-435","Honda","thermique",2,2,2,true,false);
    List<Vehicule> liste =new ArrayList<>();
    liste.add(v);liste.add(c);liste.add(m);

        System.out.println(liste);
    }
}
