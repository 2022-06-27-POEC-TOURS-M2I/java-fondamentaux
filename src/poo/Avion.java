package poo;

// "Constructeur par défaut par défaut" : C'est une version minimale du constructeur que
// la JVM invoque lorsqu'on définit aucun constructeur
public class Avion {
    private String fabricant;
    private String modele;
    private int nombreSieges;
    private String couleur;

    public Avion(String fabricant,String modele,int nombreSieges,String couleur){
        this.fabricant=fabricant;
        this.modele=modele;
        this.nombreSieges=nombreSieges;
        this.couleur=couleur;
    }


    //Constructeur par défaut
    public Avion(){
        fabricant="";
        modele="";
        nombreSieges=50;
        couleur="white";
    }

    public Avion(Avion avion){
        this.fabricant=avion.fabricant;
        this.modele=avion.modele;
        this.couleur=avion.couleur;
        this.nombreSieges= avion.nombreSieges;
    }

//    Comparaison des objets
    public boolean equals(Avion avion){
        if(avion==null){
            return false;
        }
        return this.fabricant==avion.fabricant && this.modele==
                avion.modele && this.nombreSieges==avion.nombreSieges && this.couleur==avion.couleur;
    }
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
    public void setFabricant(String fabricant){
        this.fabricant=fabricant;
    }

    public void setModele(String modele){
        this.modele=modele;
    }

    public void setCouleur(String couleur){
        this.couleur=couleur;
    }

    public void setNombreSieges(int nombreSieges){
        this.nombreSieges=nombreSieges;
    }



    public String nomCompletAvion(){
        //return fabricant+" "+modele;
        return String.format("%s %s",fabricant,modele);
    }

    public String toString(){
        return String.format("Fabricant : %s\nModele : %s\nNombre de sièges : " +
                "%d\nCouleur : %s",fabricant,modele,nombreSieges,couleur);
    }
}
