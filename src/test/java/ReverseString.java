public class ReverseString {

    public static void main(String[] args){

        String str = "raj kumar";
        String[] str1 = str.split(" ");
        
        for(int j=str1.length; j>0; j--){
        for(int i=str[j].length()-1; i>=0; i--){
            System.out.print(str[j].charAt(i));
        }
        }
    }
}
