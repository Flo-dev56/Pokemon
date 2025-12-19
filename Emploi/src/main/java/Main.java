public class Main {
    public static void main(){
        //TODO creer un fonctionnaire

        Fonctionnaire f = new Fonctionnaire("Barbut","Monique","124434524545",
                Categorie.A,"Paris", "Transition écologique");
        //TODO afficher son salaire
        System.out.println("salaire de Barbut : "+f.calculSalaireBrut());
        //TODO afficher son salaire + une prime
        System.out.println("Salaire de Barbut avec une prime de Noël : " +f.calculSalaireBrut(20000));

        GestionnairePaie paie = new GestionnairePaie();
        paie.editerAttestationSalaire(f);

        //fonctionnaire.editerAttestationSalaire();


    }
}




// faire une surcharge de la méthode calculSalaireBrut en prenant en argument un type double :
    //protected double calculSalaireBrut(double prime)

//Dans le main, rajouter la prime aux fonctionnaires