public class Calculs {
    static void main() {
        int chiffre = 0;
        int result=0;
        int i=1;
        Terminal.ecrireStringln("Saisir un chiffre compris entre 1 et 9");
        chiffre=Terminal.lireInt();
        while(i<11){
            result=chiffre*i;
            Terminal.ecrireStringln(chiffre + " x " + i + " = " + result);
            i++; // i++ est égale à i=i+1
        }
    }
}

