public class TPexo323q2 {
    static void main() {
        int n = 2;
        int compteur = 0;

        boolean premier = true;

        while(compteur <100) {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    premier = false;
                    break;
                }
            }


            if (premier) {
                Terminal.ecrireString(n + " ");
                compteur++;
            }
            n++;
        }
    }

}
