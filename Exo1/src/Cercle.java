public class Cercle {
    static void main() {
        //initialisation de la variable
        int val=0;
        Terminal.ecrireString("Veuillez saisir un entier :");
        //on recupere dans val la valeur saisie par l'utilisateur
        val=Terminal.lireInt();
        //affichage dans la console de la valeur saisie
        Terminal.ecrireString("Valeur saisie: "+ val);

        //TODO définir une nouvelle variable p
        double p=0;

        //TODO définir une vairable r pour le rayon
        double r=0;

        //TODO demander à l'utilisateur de saisir un entier pour avoir le rayon
        Terminal.ecrireString("Veulliez saisir le rayon : ");
        r=Terminal.lireDouble();

        //TODO calculer le périmètre à partir de la formule 2 * PI * r
        p=2 * Math.PI * r;

        //TODO afficher le résultat
        Terminal.ecrireStringln("Le prémimètre du cercle de rayon "+r+ " est : " + p);

        //TODO calculer la surface d'un cerle ( pi * r²)
        double surface = Math.PI * Math.pow(r,2);
        Terminal.ecrireStringln("Surface du cerle : " +surface);

        double res = 12d/5;
        Terminal.ecrireStringln("res= "+res);

    }
}