package interfaces;

public class MechantInsecte extends Personnage {

    public MechantInsecte(String name, String dateDeNaissance) {
        super(name, dateDeNaissance);
    }

    public void voler(){
        System.out.println("Je suis un insecte méchant, et je peux voler et faire du " +
                "mal");
    }
}
