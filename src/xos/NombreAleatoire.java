package xos;

import java.util.Scanner;

public class NombreAleatoire {
    public static void main(String[] args) {
        int nombreAleatoire=(int)Math.floor(Math.random()*100)+1;
        int nombreATester;
        Scanner input=new Scanner(System.in);
        do{
            System.out.print("Veuillez déviner le nombre aléatoire : ");
            nombreATester=input.nextInt();
            if(nombreATester>nombreAleatoire) {System.out.println("Plus petit");}
            else if(nombreATester<nombreAleatoire){
                System.out.println("Plus grand");
            }else{
                System.out.println("Vous avez trouvé le bon nombre");
                break;
            }

        }while (true);
    }
}
