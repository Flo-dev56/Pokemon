public class Voiture {
    private String immatriculation;
    private String modele;
    private String marque;
    //le constructeur permet de faire un new Voiture("1245-dd-45","x5","bmw")
    //quand on l'appelle d'une autre classe (ex:Main)


    public Voiture(String immatriculation, String marque, String modele) {
        this.immatriculation = immatriculation;
        this.marque = marque;
        this.modele = modele;
    }

    public Voiture() {

    }

    public Voiture(String immatriculation){
        this.immatriculation = immatriculation;
    }

    //TODO gnerer les getter et setter

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    @Override
    public String toString() {
        return "Voiture{" +
                "immatriculation='" + immatriculation + '\'' +
                ", modele='" + modele + '\'' +
                ", marque='" + marque + '\'' +
                '}';
    }
}

