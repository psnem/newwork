package Arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Al5 {

	public static void main(String[] args) {
		ArrayList<Integer> al5=new ArrayList<Integer>();
		al5.add(12);
		al5.add(15);
		al5.add(13);
		al5.add(18);
		al5.add(10);
		
		Iterator itr=al5.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());

		
		
	}

}
