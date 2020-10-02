import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateStringCount {

    public static void main(String[] args){

        List<String> str = new ArrayList<>();
        str.add("rani");
        str.add("vaani");
        str.add("rani");
        str.add("mukund");
        str.add("rani");
        str.add("vaani");
        str.add("roy");

        List<String> bufStr = new ArrayList<>();

        int k=0, cnt=1;
        do {
            for (int i = 1; i < str.size(); i++) {
                if (str.get(0).equalsIgnoreCase(str.get(i))) {
                    cnt++;
                }
            }
            int i = 0;
            if (cnt > 1) {
                bufStr.add(str.get(0));
                str.removeAll(bufStr);
                System.out.println("Number of duplicate string " + bufStr.get(0) + " count is " + cnt);
                bufStr.clear();
            }
            cnt =1;
            k++;
        }while (k<str.size());
        System.out.println("Without duplicates " + str);
    }
}
