public class TP4exo322q2 {
    static void main() {
        Terminal.ecrireString("Saisir le nombre de lignes :");
        int n= Terminal.lireInt();

        for(int i =1; i<=n; i++){
            for (int j = 1; j<=n - i ; j++){
                Terminal.ecrireString(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                Terminal.ecrireString("*");
            }
            Terminal.sautDeLigne();
        }
    }
}
