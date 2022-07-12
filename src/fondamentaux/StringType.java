package fondamentaux;

public class StringType {
    public static void main(String[] args) {
        String phrase="Je suis développeur";

        System.out.println("Taille du la chaine 'phrase' : "+phrase.length());
        System.out.println("Afficher la lettre à la position 0 : "+phrase.charAt(0));
        System.out.println("La position de la première occurence de s : "+phrase.indexOf('s'));

        int taille=phrase.length();
        System.out.println("Afficher le dernier element de la chaine : "+phrase.charAt(taille-1));

        // Extraire une sous-chaine
        String dev=phrase.substring(8,18);//[debut,fin[
        System.out.println(dev);
    }
}
