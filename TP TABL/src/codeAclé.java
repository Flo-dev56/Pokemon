import java.util.ArrayList;

public class codeAclé {

    static boolean dansAlphabet(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    static void main() {
        Terminal.ecrireString("Veuillez saisir votre message : ");
        String message= Terminal.lireString();
        Terminal.ecrireString("Veuillez saisir la clé : ");
        String cle  = Terminal.lireString();
        char [] key = cle.toCharArray();
        for(char e:key){
            Terminal.ecrireString("e" + e);
        }

        Terminal.ecrireString("Pour décoder tapez 'd' pour encoder tapez 'c' ");
        char demande = Terminal.lireChar();

        if(demande=='d'){
//            decoder(message);
            Terminal.ecrireString(decoder(message));
        } else{
//            encoder(message);
            Terminal.ecrireString(encoder(message, key));
        }

    }
    public static String encoder(String message , char [] cle) {
        String messageCode = "";
        for (int i=0; i<message.length(); i++) {
            int index= i % cle.length;
            int value = Integer.valueOf(cle[index]);
            char c = message.charAt(i);
            Terminal.ecrireString(value + "-" + c );
            if (dansAlphabet(c)) {
                c+=value;

                if (!dansAlphabet(c)) {
                    c -= 26;
                }
            }
            messageCode += c;
        }
        return messageCode;
    }

    public static String decoder (String message){
        String messageDeCode = "";
        for (int i=0; i<message.length(); i++){
            char c = message.charAt(i);
            if (dansAlphabet(c)){
                c-=3;
                if (!dansAlphabet(c)){
                    c += 26;
                }
            }
            messageDeCode +=c;
        }
        return messageDeCode;
    }


}
