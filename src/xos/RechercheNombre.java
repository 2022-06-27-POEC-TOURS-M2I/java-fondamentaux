package xos;

import java.util.Scanner;

public class RechercheNombre {
    public static void main(String[] args) {
        int[] nombres={12,45,6,7,12,23,33,6,22,3,6};
        System.out.print("Entrer le nombre à rechercher : ");
        int nombreArechercher=new Scanner(System.in).nextInt();
        int occurrences=0;
        for(int nombre:nombres){
            if(nombreArechercher==nombre){
                occurrences++;
            }
        }
        if(occurrences>0){
            System.out.printf("%d est retrouvé %d fois dans le tableau.\n",
                    nombreArechercher,occurrences);
        }else{
            System.out.printf("%d n'existe pas dans le tableau.\n",nombreArechercher);
        }

    }
}
