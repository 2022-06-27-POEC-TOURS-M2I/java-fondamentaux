package fondamentaux;

import java.util.Scanner;

public class SecondDegre {
    public static void main(String[] args) {
        System.out.println("Résolution d'une équation du 2nd degré :\n");

        Scanner input = new Scanner(System.in);
        System.out.print("Veuillez entrer la valeur de a :");
        double a = input.nextDouble();
        System.out.print("Veuillez entrer la valeur de b :");
        double b = input.nextDouble();
        System.out.print("Veuillez entrer la valeur de c :");
        double c = input.nextDouble();

        double delta = Math.pow(b, 2) - (4 * a * c);
        double x1,x2;
        if (delta >= 0) {
            x1 = ((-b-Math.sqrt(delta))/(2*a));
            x2 = ((-b+Math.sqrt(delta))/(2*a));
            System.out.printf("x1 = %.2f et x2 = %.2f", x1, x2);
        }else {
            System.out.println("L'équation n'a pas de solutions réelles");
        }

    }
}
