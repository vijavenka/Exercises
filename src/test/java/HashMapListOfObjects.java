import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class HashMapListOfObjects {
	static int tcnt=1;
	
    public static void main(String[] args) {
        
        List<String> str1 = new LinkedList<>();
        str1.add("john gopal");
        str1.add("john gopal");
        str1.add("john gopals");
        str1.add("john gopal");
        str1.add("johns gopals");
        str1.add("john gopals");
        str1.add("vijay");

        List<String> str2 = new LinkedList<>(str1);
        List<String> str3 = new LinkedList<>();
        Map<Integer, List<Object>> matches = new HashMap<>();
        List<Object> obj = new LinkedList<>();
        
        int match=0, cnt=1, size=str1.size();
        
        for(int i=1; i<size; i++){
            if(str1.get(0).equalsIgnoreCase(str1.get(i))){
                cnt++;
            }
        }
        
        do{
        	    
        	obj.add(str1.get(0));
            obj.add(cnt);
            matches.put(tcnt, obj);

            cnt=1;
            str3.add(str1.get(match));
            str1.removeAll(str3);
            str3.clear();
            size=str1.size();
            tcnt++;
            
            for(int i=1; i<size; i++){
                if(str1.get(0).equalsIgnoreCase(str1.get(i))){
                    cnt++;
                }
            }
        }while (cnt>1);

        for(int i=0; i<size; i++, tcnt++) {
        	obj.add(str1.get(i));
        	obj.add(1);
        	matches.put(tcnt, obj);
        }
        
		
		 for (Map.Entry<Integer, List<Object>> entry : matches.entrySet() ) 
		 {
		 
		 for(Object en : entry.getValue()){ System.out.print(en +" "); }
		 System.out.println(); 
		 System.out.println();
		 }
		 
    }
}

