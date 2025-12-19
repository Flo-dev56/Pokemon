import java.util.ArrayList;
import java.util.HashMap;

public class ExoMatiereHashMap {
    static void main() {
        //key -> String pour matière
        //value -> ArrayList<Integer> pour les notes
        HashMap<String, ArrayList<Integer>> listenote = new HashMap<>();
        //ajout des matières
        listenote.put("Francais", new ArrayList<>());
        listenote.put("Anglais", new ArrayList<>());
        listenote.put("Maths", new ArrayList<>());
        listenote.put("Algo", new ArrayList<>());
        ajouterNote(12, "Maths", listenote);
        ajouterNote(11, "Maths", listenote);
        ajouterNote(8, "Maths", listenote);
        ajouterNote(12, "Algo", listenote);
        ajouterNote(18, "Algo", listenote);
        afficherNotes(listenote); //on appel la fonction dans le main
    }

    static boolean ajouterNote(int n, String matiere, HashMap<String, ArrayList<Integer>> l) {
        boolean ok = false;
        if (l.containsKey(matiere) && n >= 0 && n <= 20) {
            ArrayList<Integer> listeNoteMatiere = l.get(matiere);
            listeNoteMatiere.add(n);
            ok = true;
        } else {
            ok = false;
        }
        return ok;

    }

    static void afficherNotes(HashMap<String,ArrayList<Integer>> l) {
        //afficher toutes les notes de l'ArrayList
        ArrayList<Integer> listeNoteMaths = l.get("Maths");
        Terminal.ecrireStringln("\n Notes de Maths"+listeNoteMaths.toString());
        System.out.printf("Moyenne; %.2f", calculMoyenne(listeNoteMaths));
        ArrayList<Integer> listeNoteAlgo=l.get("Algo");
        Terminal.ecrireStringln("Notes d'algo"+listeNoteAlgo.toString());
        System.out.printf("Moyenne: %.2f", calculMoyenne(listeNoteAlgo));
    }




    static double calculMoyenne(ArrayList<Integer> l){
        double res=0;
        //calcul de la moyenne de l'ensemble des notes
        for (int i:l){
            res+= i;
        }
        double moy=res/l.size();
        return moy;

    }


}