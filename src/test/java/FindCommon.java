import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FindCommon {

    static List<Integer> num1 = Arrays.asList(20, 2, 01, 30, 10);
    static List<Integer> num2 = Arrays.asList(10, 01, 20, 2, 40);
    static List<Integer> num3 = Arrays.asList(80, 20, 40, 01, 2);
    static List<Integer> cn1 = new LinkedList<>();
    static List<Integer> cn2 = new LinkedList<>();
    static List<Integer> cn3 = new LinkedList<>();

    public static void main(String[] args){
        swap(num1);
        swap(num2);
        swap(num3);
        display(common(num1, num2));
        display(common(num2, num3));
        display(common(cn1, cn2));
    }

    private static void swap(List<Integer> num1){
        int swap, cnt=0;
        do {
                for (int i = 0; i < num1.size() - 1; i++) {
                    if (num1.get(i) > num1.get(i + 1)) {
                        swap = num1.get(i);
                        num1.set(i, num1.get(i + 1));
                        num1.set(i + 1, swap);
                    }
                }
                cnt++;
        } while (cnt < num1.size()) ;

        for (int n:num1
             ) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    private static List<Integer> common(List<Integer> num1, List<Integer> num2){

        List<Integer> cn = new LinkedList<>();
        int n1 = num1.size();
        int n2 = num2.size();
        int n = Math.min(n1, n2);

        for(int i=0; i<n; i++){
            if(num1.get(i).equals(num2.get(i))){
                cn.add(num1.get(i));
            }
        }
        return cn;
    }

    private static void display(List<Integer> num){
        System.out.println("Display ...");
        for (int n:num
             ) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
