package xos;

// Approche avant les méthodes(réutilisation)
public class SommeTableaux {
    public static void main(String[] args) {
        byte[] t1={2, 6, 8, 15,39,11 };
        byte[] t2={21, 33, 12, 19,0 };
        byte[] t3={17, 18, 46};

        short sommeMultiple3T1=0;
        for(byte chiffre:t1){
            if(chiffre%3==0){
                sommeMultiple3T1 +=chiffre;
            }
        }

        short sommeMultiple3T2=0;
        for(byte chiffre:t2){
            if(chiffre%3==0){
                sommeMultiple3T2 +=chiffre;
            }
        }


        short sommeMultiple3T3=0;
        for(byte chiffre:t3){
            if(chiffre%3==0){
                sommeMultiple3T3 +=chiffre;
            }
        }

        int somme=sommeMultiple3T1+sommeMultiple3T2+sommeMultiple3T3;
        System.out.println(somme);
    }
}
