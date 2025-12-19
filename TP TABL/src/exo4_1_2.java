public class exo4_1_2 {
    public static String affichageTab(int []tableau) {
        String res = "";
        for (int i = 0; i < tableau.length; i++) {
            res = res + tableau[i] + " - ";
        }
        return res;
    }
//    static void main() {
//        char [] tab = {'a', 'b', 'x', 'd', 'e'};
////        char grand ="0";
//
//        for (int i = 0; i< tab.length; i++){
//            if (grand< tab[i]) {
//            grand=tab[i];
//            }
//        }
//        Terminal.ecrireChar(grand);



    }