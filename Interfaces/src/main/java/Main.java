import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        Animal chat = new Chat();
        Animal chien = new Chien();
        Animal lapin = new Lapin();

        List <Animal> liste = new ArrayList<>();
        liste.add(chat);
        liste.add(chien);
        liste.add(lapin);

        for(Animal a:liste){
            a.crier();
        }
    }
}
