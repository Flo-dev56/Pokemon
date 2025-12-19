import java.io.*;
import java.io.File;
import java.io.IOException;

public class crypterTexte {
    public static void main () throws IOException {
        lireTexte("monfichier.txt");
        yy
//        char[] cle = {2,3,5};

    }
//    static boolean dansAlphabet(char c) {
//        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
//    }

//    public static String encoder(String message , char [] cle) {
//        String messageCode = "";
//        for (int i = 0; i < message.length(); i++) {
//            int index = i % cle.length;
//            int value = Integer.valueOf(cle[index]);
//            char c = message.charAt(i);
//            Terminal.ecrireString(value + "-" + c);
//            if (dansAlphabet(c)) {
//                c += value;
//
//                if (!dansAlphabet(c)) {
//                    c -= 26;
//                }
//            }
//            messageCode += c;
//        }
//        return messageCode;
//    }
    public static void lireTexte(String nomfichier) throws IOException
    {

        // D�claration du fichieren entr�e
        //
        String nomFichierEntree = "texte"+ File.separator+ nomfichier;
        BufferedReader lecteurAvecBuffer = null;
        String ligne;

        try
        {
            lecteurAvecBuffer = new BufferedReader(new FileReader(nomFichierEntree));
        }
        catch(FileNotFoundException exc)
        {
            System.out.println("Erreur d'ouverture");
        }
        while ((ligne = lecteurAvecBuffer.readLine()) != null)
            System.out.println(ligne);
        lecteurAvecBuffer.close();
    }

}
