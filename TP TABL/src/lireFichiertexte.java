import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


class lireFichiertexte
{
  public static void main(String[] argv) throws IOException
  {
	  


      // Déclaration du fichieren entrée
      //
      String nomFichierEntree = "texte"+File.separator+"monfichier.txt";
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
