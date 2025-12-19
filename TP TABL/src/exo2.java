public class exo2 {
    static void main() {
        int[] tab = {12, 15, 13, 10, 8, 9, 13, 14};
        boolean sortie = true;
        Terminal.ecrireStringln("Saisir 0 si vous souhaitez quitter le programme");
        do {
            Terminal.ecrireString("Saisir un nombre : ");
            int n = Terminal.lireInt();
            boolean dansTab = false;
            if(n==0){
                sortie=false;
            }

            for (int i = 0; i < tab.length; i++) {
                if (n == tab[i]) {
                    dansTab = true;
                    Terminal.ecrireStringln(" on retrouve le nombre => Index " + i + " ");
                }
            }


            if (!dansTab) {
                Terminal.ecrireString("Le nombre " + n + " n'est pas dans le tableau");
            }
        }
        while (sortie);
    }
}
