package heritage;

public class Magicien {
    private String nom;
    private int dureeDeVie;
    private String baguette;

    public Magicien(String nom, int dureeDeVie, String baguette) {
        this.nom = nom;
        this.dureeDeVie = dureeDeVie;
        this.baguette = baguette;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getDureeDeVie() {
        return dureeDeVie;
    }

    public void setDureeDeVie(int dureeDeVie) {
        this.dureeDeVie = dureeDeVie;
    }

    public String getBaguette() {
        return baguette;
    }

    public void setBaguette(String baguette) {
        this.baguette = baguette;
    }

    public void rencontrer(){
        System.out.println("Je vais te faire disparaitre");
    }

    @Override
    public String toString() {
        return String.format("Nom : %s\nDurée de vie : %d\nBaguette : %s\n",nom,
                dureeDeVie,
                baguette);
    }
}
