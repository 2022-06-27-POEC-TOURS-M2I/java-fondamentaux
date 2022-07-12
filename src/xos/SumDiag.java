package xos;

public class SumDiag {
    static int sumDiag(int[][] matrix){
        int sumDiagonal=0;
        for(int i=0;i<matrix.length;i++){
            sumDiagonal +=matrix[i][i]+matrix[i][matrix.length-i-1];
        }
        return sumDiagonal;
    }

    public static void main(String[] args) {
        /*
        *  1 2 3
        *  4 5 6
        *  12 8 9
        *
        * Diagonal 1 = 1 + 5 + 9 = 15
        * Diagonal 2 = 12 + 5 + 3 = 20
        * Somme = 15 + 20 = 35
        * */
        System.out.println(sumDiag(new int[][]{{1,2,3},{4,5,6},{12,8,9}}));
    }
}
