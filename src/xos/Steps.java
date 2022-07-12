package xos;

public class Steps {
    static void steps(int n) {
        for (int row = 0; row < n; row++) {
            String stair = "";
            for (int column = 0; column < n; column++) {
                if (column <= row) {
                    stair += '#';
                } else {
                    stair += ' ';
                }
            }
            System.out.println(stair);
        }
    }

    public static void main(String[] args) {
        steps(4);
    }
}
