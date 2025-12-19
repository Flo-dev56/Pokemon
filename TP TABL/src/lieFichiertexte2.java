import java.io.BufferedReader;
import java.io.File;

public class lieFichiertexte2 {


	    public static void main(String[] arg)  throws java.io.IOException {
		java.util.Scanner lecteur ;
	      // Déclaration du fichieren entrée
	      //
	      String nomFichierEntree = "texte"+File.separator+"monfichier.txt";
	    BufferedReader lecteurAvecBuffer = null;
	    String ligne;
		java.io.File fichier = new java.io.File(nomFichierEntree);
		lecteur = new java.util.Scanner(fichier);
		
		/* ou bien
		   java.io.InputStream entree = 
		   LireFichierTexteBis.class.getResourceAsStream((arg[0])); 
		   lecteur = new java.util.Scanner(entree);
		*/
		
		  while (lecteur.hasNextLine())
		      System.out.println(lecteur.nextLine());
	}
}
