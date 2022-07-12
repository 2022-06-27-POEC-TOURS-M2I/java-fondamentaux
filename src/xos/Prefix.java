package xos;

public class Prefix {
    static boolean isPrefix(String str1,String str2){
        if(str1.length()>str2.length()){
            return str1.startsWith(str2);
        }else{
            return str2.startsWith(str1);
        }
    }
    public static void main(String[] args) {
        System.out.println(isPrefix("banner","bang"));
        System.out.println(isPrefix("hugging","hug"));
    }
}
