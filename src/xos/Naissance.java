package xos;

import java.util.Calendar;
import java.util.Scanner;

public class Naissance {
    public static void main(String[] args) {
        Scanner clavier=new Scanner(System.in);
        System.out.printf("Votre age : ");
        byte age=clavier.nextByte();
        int anneeNaissance= Calendar.getInstance().get(Calendar.YEAR)-age;
        System.out.println("Année naissance : "+anneeNaissance);
    }
}
