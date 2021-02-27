import java.util.*;

public class MapPractice {
    
        public static void main(String[] args) {
            Map<String, List<String>> map = new TreeMap<>();

            List<String> list1 = new LinkedList<>();
            list1.add("one");
            list1.add("two");
            list1.add("three");

            List<String> list2 = new LinkedList<>();
            list2.add("four");

            List<String> list3 = new LinkedList<>();
            list3.add("five");

            map.put("c1", list1);
            map.put("c2", list2);
            map.put("c3", list3);
            map.put("c4", list3);

            for (Map.Entry<String, List<String>> entry :map.entrySet()
                 ) {
                switch (entry.getKey()) {
                    case "c1":
                    case "c2":
                    case "c3":
                        System.out.println(entry.getValue());
//                        System.out.println(entry.getValue().get(0));
                        break;
                    default:
                        System.out.println("Invalid case");
                }
                System.out.println();
            }
        }
    }
