import java.util.HashMap;

public class ExoRomain {

    static void main() {
        boolean sortie=false;
        HashMap<Character,Integer> listeRomain=new HashMap<>();
        listeRomain.put('I',1);
        listeRomain.put('V',5);
        listeRomain.put('X',10);
        listeRomain.put('L',50);
        listeRomain.put('C',100);
        listeRomain.put('D',500);
        listeRomain.put('M',1000);
//        do {
//            Terminal.ecrireString("Tapez s pour sortir ou saisissez une chiffre Romain:");
//            char val = Terminal.lireChar();
//            if(val=='s'){
//                sortie=true;
//            } else {
//                conversion(val, listeRomain);
//            }
//        }while(!sortie);

//        do {
//            Terminal.ecrireString("Tapez s pour sortir ou saisissez une chiffre Romain:");
//            String val = Terminal.lireString();
//            if(val=="s"){
//                sortie=true;
//            } else {
//                conversion(val, listeRomain);
//            }
//        }while(!sortie);
//    }


//    public static void conversion(char c,HashMap<Character,Integer> l){
//      // si le char romain est présent dans l'une des clés de la hashmap
//        //alors retourner sa value
//        if(l.containsKey(Character.toUpperCase(c))){
//            Terminal.ecrireStringln("valeur:" + l.get(Character.toUpperCase(c)));
//        }
//    }
//
//    public static void conversion2(){
//    for (int i = 0 ; i < val.length(); i++){
//
//    }
    }
}
