public class codeJulesCesar {

    static boolean dansAlphabet(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    static void main() {
        Terminal.ecrireString("Veuillez saisir votre message : ");
        String message= Terminal.lireString();
        Terminal.ecrireString("Pour décoder tapez 'd' pour encoder tapez 'c' ");
        char demande = Terminal.lireChar();

        if(demande=='d'){
//            decoder(message);
            Terminal.ecrireString(decoder(message));
        } else{
//            encoder(message);
            Terminal.ecrireString(encoder(message));
        }

    }

    public static String encoder(String message) {
        String messageCode = "";
        for (int i=0; i<message.length(); i++) {
            char c = message.charAt(i);
            if (dansAlphabet(c)) {
                c += 3;
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
