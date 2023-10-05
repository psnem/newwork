package dsa;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnTreeMap {
	
	public static void main(String[] args) {
		Map<Integer, String> mp =new TreeMap<Integer, String>();
		// sort the keys
		mp.put(1, "one");
		mp.put(2, "two");
		mp.put(3, "three");
		mp.put(4, "four");
		
		System.out.println(mp);
		
			}


}
