public class TP3_1_5 {
    static void main() {

        int annee;
        boolean anneeOk = false;
        // calcul année
        do {
            Terminal.ecrireString("entrez une année : ");
            // Terminal.sautDeLigne();
            annee = Terminal.lireInt();
            if (annee < 1700 || annee > 2400) {
                Terminal.ecrireStringln("L'année saisie est incorrecte");
            } else {
                anneeOk = true;
            }


        } while (anneeOk == false);

        //annee bisextile
        int varbisext;
        if ((annee % 4 == 0 && annee % 100 != 0) || annee % 400 == 0) {
            varbisext = 29;
            Terminal.ecrireString("l'année est bissextile");
            Terminal.sautDeLigne();
        } else {
            varbisext = 28;
        }


        // calcul mois
        Terminal.ecrireString("entrez un mois : ");
        int mois = Terminal.lireInt();

        while (mois < 1 || mois > 12) {
            Terminal.ecrireString("Vous avez fait une erreur. Entrez un mois entre 1 et 12 : ");
            mois = Terminal.lireInt();
        }

        // calcul jour
        Terminal.ecrireString("entrez un jour : ");
        int jour = Terminal.lireInt();

        if (mois == 1 || mois == 3 || mois == 5 || mois == 7 || mois == 8 || mois == 10 || mois == 12) {
            while (jour < 1 || jour > 31) {
                Terminal.ecrireString("Le mois N°" + mois + "ne contient que 31 jours. Ressaisissez le mois : ");
                jour = Terminal.lireInt();
            }
        }
        else if (mois == 4 || mois == 6 || mois == 9 || mois == 11) {
            while (jour < 1 || jour > 30) {
                Terminal.ecrireString("Le mois N°" + mois + "ne contient que 30 jours");
                jour = Terminal.lireInt();
            }
        }
        else if (mois == 2) {
            while (jour < 1 || jour > varbisext) {
                Terminal.ecrireString("Le mois N°" + mois + "ne contient que 28 jours");
                jour = Terminal.lireInt();
            }
        }
        Terminal.ecrireString("la date " + jour + "/" + mois + "/" + annee + " est valide");
    }
}
