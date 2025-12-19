public class exo1 {
    static void main() {
        int[] tab = {12, 15, 13, 10, 8, 9, 13, 14};
        Terminal.ecrireString("Saisir un nombre : ");
        int n = Terminal.lireInt();
        boolean dansTab = false;

        for (int i = 0; i < tab.length; i++) {
            if (n == tab[i]) {
                dansTab = true;
                break;
            }
        }


        if (dansTab) {
            Terminal.ecrireString("Le nombre " + n + " est dans le tableau");
        } else {
            Terminal.ecrireString("Le nombre " + n + " n'est pas dans le tableau");
        }

    }


}

