public abstract class Animal {
    protected int poids;
    protected String couleur;

    protected abstract void boire();
    protected abstract void manger();
    protected abstract void deplacement();
    protected abstract void crier ();

    public Animal(String couleur, int poids) {
        this.couleur = couleur;
        this.poids = poids;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public int getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "couleur='" + couleur + '\'' +
                ", poids=" + poids +
                '}';
    }
}
