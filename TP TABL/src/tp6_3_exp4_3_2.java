import java.util.Objects;

public class tp6_3_exp4_3_2 {
    static void main() {

        boolean[][] occupee = {{false, true, true, true, false, true, true, false, true, false},
                {false, true, true, true, false, true, true, false, true, false},
                {false, false, true, true, false, false, true, false, true, false},
                {true, true, false, true, false, true, true, false, true, true},
                {false, true, false, true, false, true, true, false, false, false}};
        String[] jour = {"lundi", "mardi", "mercredi", "jeudi", "vendredi"};
         int plageOcupee = 0;
        for  (int j = 0; j < 5; j++) {
            for (int h = 0; h < 10; h++){
                if (occupee[j][h]) { //on pourrait mettre !occupee... pour vérifier si faux
                    Terminal.ecrireString("La salle est occupée le " + jour[j] + " de " +( h + 8) + " heures à " + (h + 9) + " heures");
                    Terminal.sautDeLigne();
                    plageOcupee +=1;
                }

            }

        }
        Terminal.ecrireString("la salle est occupée à " + (plageOcupee*100 / 50) + "%");
        Terminal.sautDeLigne();
        Terminal.ecrireString("RESERVATION DE LA SALLE DE REUNION :  \n 0:Lundi - 1:Mardi - 2:Mercredi - 3:Jeudi - 4:Vendredi \nHeures : saire un chiffre de 8 à 17");
        Terminal.sautDeLigne();
        boolean rester = true;
        while(rester) {
        Terminal.ecrireString("Veuillez saisir le jour :  ");
        int resJ = Terminal.lireInt();
        Terminal.sautDeLigne();
        Terminal.ecrireString("Veuillez saisir l'heure : ");
        int resH = Terminal.lireInt();
        resH = resH - 8;
            if (occupee[resJ][resH]) {
                Terminal.ecrireString("La salle est déjà réservée, veuillez choisir un autre créneau \n");
            } else {
                occupee[resJ][resH] = true;
                Terminal.ecrireString("La salle a bien été réservée \n ");
            }
            Terminal.ecrireString("Voulez vous réserver une autre salle o/n ? ");
            String reponse = Terminal.lireString();
            if (reponse.equals("n")) {
                rester = false;
                Terminal.ecrireString("Au revoir !");
            }
        }
    }
}

