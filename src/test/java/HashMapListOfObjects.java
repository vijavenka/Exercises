import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

class HashMapListOfObjects {
 
	static List<String> str1 = new LinkedList<>();
	List<String> str1Copy;
	
	public static void main(String[] args) {
		str1.add("siddharth");
		str1.add("siddharth saurav");
		str1.add("Jasti");
		str1.add("Jasti");
		str1.add("aravind");
		str1.add("siddharth saurav");
		str1.add("Jasti");
		
		FindDuplicateCounts(str1);
	}

	private static void FindDuplicateCounts(List<String> str1) {

		Map<Integer, List<Object>> duplicateStringCount = new HashMap<>();
		List<Object> tempStr1 = new LinkedList<>();
		
		int size = str1.size();
		int strCounter=1, cnt=0, i=0, j=0;
		
		Collections.sort(str1);
		
		for(; i<size-1; ) 
		{
		for(j=i+1; j<size; j++) 
			{
				if(str1.get(i).equalsIgnoreCase(str1.get(j))) {
					strCounter++;
				}
			}  
		tempStr1.add(str1.get(i));
		str1.removeAll(tempStr1);
		tempStr1.add(strCounter);
		duplicateStringCount.put(cnt, tempStr1);
		strCounter=1;
		cnt++;
		
		tempStr1 = new LinkedList<>();
		size = str1.size();
		i=0;
		j=i+1;
		}
		
		for(Entry<Integer, List<Object>> entry: duplicateStringCount.entrySet()) {
				System.out.print(entry.getValue());
		}
	}
}
