package dsa;

import java.util.Set;
import java.util.TreeSet;

public class LearnTreeSet {

	public static void main(String[] args) {
		Set<Integer> s=new TreeSet<Integer>();
		//always in a sorted manner
				s.add(12);
				s.add(1);
				s.add(2);
				s.add(62);
				s.add(22);
				
				System.out.println(s);
				
				s.remove(12); 
				// we cant remove it with index, because data is saved based on hash
				System.out.println(s);
			
				System.out.println(s.contains(22));
				System.out.println(s.isEmpty());
				System.out.println(s.size());
				s.clear();
				System.out.println(s);
			
			

	}

}
