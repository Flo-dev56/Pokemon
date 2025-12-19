

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class ecrireTexte
{
  public static void main(String[] argv) throws IOException
  {
    PrintWriter ecrire;
    int n = 5;
    File rep = new File("texte");
    rep.mkdir(); // Si le repertoire existe déjà cette méthode ne fait rien

    // Déclaration du fichier de sortie
    //
    String nomFichierSortie = "texte"+File.separator+"monfichier.txt";
   
    ecrire =  new PrintWriter(new BufferedWriter
	   (new FileWriter(nomFichierSortie)));
   
    ecrire.println("bonjour, comment ça va ?");
    ecrire.println("nous ecrivons un fichier texte");
    ecrire.print("inserons des entiers : ");
    ecrire.println(n);
    ecrire.print("On peut mettre des instances de Object : ");
    ecrire.println(new Integer(36));
    ecrire.close();
  }
} 
