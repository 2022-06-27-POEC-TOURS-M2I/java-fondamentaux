package xos;

public class TableMultiplication {
    public static void main(String[] args) {
        byte debut=2,fin=10;
        for(byte i=debut;i<=fin;i++){
            for(byte j=0;j<=12;j++){
                System.out.printf("%d x %d = %d\n",i,j,(i*j));
            }
            System.out.printf("\n");
        }
    }
}
