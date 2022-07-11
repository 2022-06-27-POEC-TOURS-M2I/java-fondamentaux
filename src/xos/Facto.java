package xos;

public class Facto {
    public static void main(String[] args) {
//      Pour l'exo le nombre ne sera jamais zero car la factorielle de 0 est 1
        short nombre=8;
        int factorielle=1;
        for(short i=1;i<=nombre;i++){
            System.out.printf("%d",i);
            factorielle *=i;
            if(i==nombre){
                System.out.printf(" = ");
            }else{
                System.out.printf(" * ");
            }
        }
        System.out.printf("%d",factorielle);
    }
}
