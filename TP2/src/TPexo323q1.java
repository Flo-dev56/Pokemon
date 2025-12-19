public class TPexo323q1 {

    static void main() {
        Terminal.ecrireString("Saisir le nombre :");
        int n = Terminal.lireInt();
        boolean premier = true;
        if (n <= 1) {
            premier = false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    premier = false;
                    break;
                }
            }
        }

        if(premier) {
            Terminal.ecrireString("le nombre est premier");
        }
        else{
            Terminal.ecrireString("le nombre n'est pas premier");
        }
    }

}




