package xos;

import java.util.Scanner;

public class Parite {
    public static void main(String[] args) {
        Scanner clavier=new Scanner(System.in);
        byte nombre=clavier.nextByte();
        String parite=nombre%2==0?"pair":"impair";

        if(nombre>0){
            System.out.printf("%d est posifif et %s",nombre,parite);
        }else if(nombre<0){
            System.out.printf("%d est négatif et %s",nombre,parite);
        }else{
            System.out.println("0 et pair");
        }
    }
}
