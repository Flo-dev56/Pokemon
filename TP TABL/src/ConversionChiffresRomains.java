import java.util.HashMap;

public class ConversionChiffresRomains {
    static void main() {
        HashMap<Character,Integer> listeRomain=new HashMap<>();
        listeRomain.put('I',1);
        listeRomain.put('V',5);
        listeRomain.put('X',10);
        listeRomain.put('L',50);
        listeRomain.put('C',100);
        listeRomain.put('D',500);
        listeRomain.put('M',1000);

        char chiffreromain;
        Terminal.ecrireString("Entrer un chiffre Romain : ");
        chiffreromain= Terminal.lireChar();
        char chiffre = Character.toUpperCase(chiffreromain);
        conversion(chiffre,listeRomain);

    }

    static void conversion(char c,HashMap<Character,Integer> l){
        if (l.containsKey(c)){
            Terminal.ecrireString("Valeur numérique = :"+l.get(c));
        }
    }
}
