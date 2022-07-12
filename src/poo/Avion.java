package poo;

public class Avion {
    private String fabricant;
    private String modele;
    private int nombreSieges;
    private String couleur;


//    Getters ou Accesseurs
    public String getFabricant(){
        return fabricant;
    }

    public String getModele(){
        return modele;
    }

    public int getNombreSieges(){
        return nombreSieges;
    }

    public String getCouleur(){
        return couleur;
    }

//    Setters ou manipulateurs
    public void setFabricant(String nouvelleValeur){
        fabricant=nouvelleValeur;
    }

    public void setModele(String nouvelleValeur){
        modele=nouvelleValeur;
    }

    public void setCouleur(String nouvelleValeur){
        couleur=nouvelleValeur;
    }

    public void setNombreSieges(int nouvelleValeur){
        nombreSieges=nouvelleValeur;
    }



    String nomCompletAvion(){
        //return fabricant+" "+modele;
        return String.format("%s %s",fabricant,modele);
    }
}
