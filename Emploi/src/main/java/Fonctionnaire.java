public class Fonctionnaire extends Employe {
    private Categorie categorie;
    private String lieuTravail;
    private String ministereRattachement;


    public Fonctionnaire(String nom, String prenom, String numSecu, Categorie categorie, String lieuTravail, String ministereRattachement) {
        super(nom,prenom, numSecu);
        this.categorie = categorie;
        this.lieuTravail = lieuTravail;
        this.ministereRattachement = ministereRattachement;
    }


    @Override
    protected double calculSalaireBrut(){
        double salaireBrut=0;
        double salaireBaseBrut = super.calculSalaireBrut();
        if(this.categorie.equals(Categorie.A)){
            salaireBrut= salaireBaseBrut +500;
        } else if (this.categorie.equals(Categorie.C)) {
            salaireBrut = salaireBaseBrut + 100;
        }
        return salaireBrut;
    }

    protected double calculSalaireBrut(double prime){
        return calculSalaireBrut() + prime;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public String getLieuTravail() {
        return lieuTravail;
    }

    public void setLieuTravail(String lieuTravail) {
        this.lieuTravail = lieuTravail;
    }

    public String getMinistereRattachement() {
        return ministereRattachement;
    }

    public void setMinistereRattachement(String ministereRattachement) {
        this.ministereRattachement = ministereRattachement;
    }

    @Override
    public String toString() {
        return "Fonctionnaire{" + super.toString()+
                "categorie=" + categorie +
                ", lieuTravail='" + lieuTravail + '\'' +
                ", ministereRattachement='" + ministereRattachement + '\'' +
                '}';
    }
}
