public class DateCorrecte {
    static void main() {
        //TODO définir les variables jour mois année
        //TODO demander à l'utilisateur de saisir un jour,un mois et une année
        int annee=0;
        int mois=0;
        int jour=0;
        boolean anneeOk=false;
        boolean moisOk=false;

        do{
            Terminal.ecrireStringln("Saisir l'année : ");
            annee=Terminal.lireInt();
            if(annee<2400 && annee>1700){
                anneeOk=true;
            }
            else Terminal.ecrireStringln("Erreur de saisie");
        }while(anneeOk==false);



//        Terminal.ecrireStringln("Saisir l'année : ");
//        annee=Terminal.lireInt();
//        while (annee>2400 || annee<1700)
//        {
//            Terminal.ecrireStringln("Saisie année incorrecte merci de saisir une date cohérente");
//            annee=Terminal.lireInt();
//        }

        do{
            Terminal.ecrireStringln("Saisir le mois : ");
            mois=Terminal.lireInt();
            if(annee<12 && annee>1){
                moisOk=true;
                }
            else Terminal.ecrireStringln("Erreur de saisie");
        }while(moisOk==false);
//
//        do{
//            Terminal.ecrireStringln("Saisir le jour : ");
//            jour=Terminal.lireInt();
//
//            else if Terminal.ecrireStringln("Erreur de saisie");
//        }while(jour==false);



        //TODO contrôler que l'année saisie est entre 1700 et 2400

        //TODO contrôler que le mois saisi est entre 1 et 12

        //TODO contrôler que le jour est compris:
        //1 et 30 pour les mois à 30 jours
        //1 et 31 pour les mois à 30 jours
        //1 et 28 pour les mois de Février
        //TODO en cas d'erreur, afficher un message indiquant la raison de l'erreur.
    }
}