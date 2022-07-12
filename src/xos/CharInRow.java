package xos;

public class CharInRow {
    static boolean range(String str){
        String[] arr=str.split("");
        for(int i=0;i<str.length();i++){
            if((i+1)>=arr.length){
                break;
            }
            if(arr[i].equals(arr[i+1])){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(range("chats !!"));
    }
}
