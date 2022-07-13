package heritage;

public class Sorcier {
    private String nom;
    private int dureeDeVie;
    private String baguette;
    private String batonMagique;

    public Sorcier(String nom, int dureeDeVie, String baguette, String batonMagique) {
        this.nom = nom;
        this.dureeDeVie = dureeDeVie;
        this.baguette = baguette;
        this.batonMagique = batonMagique;
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

    public String getBatonMagique() {
        return batonMagique;
    }

    public void setBatonMagique(String batonMagique) {
        this.batonMagique = batonMagique;
    }

    public void rencontrer(){
        System.out.println("Je vais te transformer en biscuit.");
    }

    @Override
    public String toString() {
        return String.format("Nom : %s\nDurée de vie : %d\nBaguette : %s\nBaton magique" +
                        " : %s\n",nom,dureeDeVie,
                baguette,batonMagique);
    }
}
