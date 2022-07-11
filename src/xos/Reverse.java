package xos;

public class Reverse {
    public static void main(String[] args) {
        String str="papy";
        String reversed="";
        for(String letter:str.split("")){
            reversed = letter+reversed;
        }
        System.out.println(reversed);
    }
}
