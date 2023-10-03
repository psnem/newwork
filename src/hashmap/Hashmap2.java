package hashmap;

import java.util.Map;
import java.util.TreeMap;

public class Hashmap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Map<String, Double> map = new TreeMap<String,Double>();
	        
	        map.put("Bob", 6.0);
	        map.put("Charlie", 5.9);
	        map.put("Alice", 5.6);
	        
	        map.remove("Charlie");
	        
	        System.out.println(map);

	}

}
