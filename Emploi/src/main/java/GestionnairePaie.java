public class GestionnairePaie {
    public GestionnairePaie() {
    }

    public void editerAttestationSalaire(Employe e){
    double salaire = e.calculSalaireBrut();
    String texte = "attestation officielle. Montant du salaire : "+ salaire;
        System.out.println(texte);
    }



}

