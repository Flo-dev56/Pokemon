public class tp7_ex515 {
    public static int[] ajoutTab(int[] tab1, int[] tab2){
        int [] tab3 = new int [tab1.length + tab2.length];
        for (int i=0; i<= tab1.length; i++){
            tab3 = new int [tab1[i]];
        }
        for (int j=tab1.length; j<= tab2.length; j++){
            tab3[j] = tab2[j];
        }
        return tab3;
    }

    static void main() {
        int [] tableau1 = {1,2,3,4};
        int[] tableau2 = {5,6,7,8};
//        Terminal.ecrireString(ajoutTab (tableau1,tableau2));


    }
}
