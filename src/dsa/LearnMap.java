package dsa;

import java.util.HashMap;
import java.util.Map;

public class LearnMap {

	public static void main(String[] args) {
		Map<Integer, String> mp=new HashMap<Integer, String>();
		mp.put(1, "one");
		mp.put(2, "two");
		mp.put(3, "three");
		mp.put(4, "four");
		
		mp.put(2,"Do"); // here it updates the value which has 2 as a key
		
		mp.putIfAbsent(3,"Teen"); // it is not absent it will not be added
		mp.putIfAbsent(5,"five");
		System.out.println(mp);
		
		for(Map.Entry<Integer, String> e:mp.entrySet())
		{
			//System.out.println(e);
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		for(Integer s: mp.keySet()) {
			System.out.println(s);
		
		}
		
		System.out.println(mp.isEmpty());
		System.out.println(mp.containsKey(2));
	}

}
