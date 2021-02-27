import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateString {

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
        List<Integer> pos = new ArrayList<>();

        int l=1, j=0, k=0;
        do {
            int size = str.size();
            for (int i = l; i < size; i++) {
                if (str.get(j).equalsIgnoreCase(str.get(i))) {
                    str.remove(i);
                    size = str.size();
                }
            }
            l++;
            j++;
            k++;
        }while (k<str.size());
        System.out.println("Without duplicates " + str);
    }
}
