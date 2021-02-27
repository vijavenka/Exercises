public class ReverseString {

    public static void main(String[] args){

        String str = "raj kumar venkat prabhu";

        String[] str1 = str.split(" ");

        for(int j=str1.length-1; j>=0; j--){
        for(int i=str1[j].length()-1; i>=0; i--){
            System.out.print(str1[j].charAt(i));
        }
            System.out.println();
        }
    }
}
