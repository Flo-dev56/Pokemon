public class Adresse {
    int id;
    String numero;
    String rue;
    String codePostal;
    String ville;

    public Adresse(String numero,String rue,String codePostal, String ville) {
        this.numero = numero;
        this.rue = rue;
        this.codePostal = codePostal;
        this.ville = ville;
    }
        //TODO generer getter et setter

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    //TODO generer toString

    @Override
    public String toString() {
        return "Adresse{" +
                "codePostal='" + codePostal + '\'' +
                ", numero='" + numero + '\'' +
                ", rue='" + rue + '\'' +
                ", ville='" + ville + '\'' +
                '}';
    }
}
