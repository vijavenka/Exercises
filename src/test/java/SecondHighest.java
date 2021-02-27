import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SecondHighest {

    public static void main(String[] args) {
//        1. should not sort it
//        2. Find the second largest number

        List<Integer> list1 = Arrays.asList(122, 12, 31, 10, 10, 30, 41, 100, 51);
        List<Integer> res = new LinkedList<>();
        int result, cnt=0;

        for(int i=0; i<list1.size(); i++) {
            for (int j = 0; j < list1.size(); j++) {
                if (list1.get(i) < list1.get(j)){
                    cnt++;
                }
            }

            if(cnt == 1) {
                System.out.println("Second largest : " + list1.get(i));
                break;
            }
            cnt=0;
        }
    }
}
