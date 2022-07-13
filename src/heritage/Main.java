package heritage;

public class Main {
    public static void main(String[] args) {
        var chris = new Guerrier("Christian", 200, "M16 A4");
        System.out.println(chris.getNom());
        chris.setNom("Cricri");
        System.out.println(chris.getNom());

        var bamos = new Magicien("Bamos", 500, "Baguette Zozor");
        var mamadou = new Sorcier("Mamadou", 300, "BaguetteDou", "BatonZor");

        chris.rencontrer();
        bamos.rencontrer();
        mamadou.rencontrer();
    }
}
