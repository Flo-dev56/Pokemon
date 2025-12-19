import java.util.ArrayList;

public class ExoArrayList {

    static void main() {
        ArrayList<Integer> listenote= new ArrayList<>();
        boolean sortie= false;
        do {
            Terminal.ecrireStringln("Pour sortir ecrire: 99");
            Terminal.ecrireString("Ajouter une note:");
            int note = Terminal.lireInt();
            if(note!=99) {
                if (ajouterNote(note, listenote)) {
                    Terminal.ecrireStringln("la note " + note + " a bien été ajoutée");
                } else {
                    Terminal.ecrireStringln("Erreur, la note doit être entre 0 et 20");
                }
            } else {
                sortie=true;
            }
        }while(!sortie);
        afficherNotes(listenote);
        Terminal.sautDeLigne();
        System.out.printf("Moyenne: %.2f",calculMoyenne(listenote));

    }
    static boolean ajouterNote(int n,ArrayList<Integer> l){
        boolean ok=false;
        if(n>=0 &&n<=20 ){
            //ajouter la note à listenote
            l.add(n);
            ok=true;
        }
        else {
            ok=false;
        }
        return ok;
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

    static void afficherNotes(ArrayList<Integer> l){
        //afficher toutes les notes de l'ArrayList
        for (int i:l){
            Terminal.ecrireString(i+"-");
        }
    }
}
