import java.awt.image.PixelInterleavedSampleModel;

public class TP4exo324 {
    static void main() {
        Terminal.ecrireString("nombre a : ");
        int a = Terminal.lireInt();
        Terminal.ecrireString("nombre b : ");
        int b = Terminal.lireInt();
        double r = Math.pow(a,b);
        Terminal.ecrireString("Résultat : " + r);

    }
}
