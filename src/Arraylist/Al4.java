package Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class Al4 {

	public static void main(String[] args) {
		ArrayList<String> al4= new ArrayList<String>();
		al4.add("Piyush");
		al4.add("Neel");
		al4.add("Durgesh");
		al4.add("Chandu");
		
		Collections.sort(al4);
		
		for(String st:al4)
			System.out.println(st);
		
		System.out.println("in reverse order");
		ListIterator<String> li=al4.listIterator(al4.size());
		while(li.hasPrevious())
		{
			System.out.println(li.previous()); ;
		}
		System.out.println("this is done by iterator");
		Iterator<String> l=al4.iterator();
		while(l.hasNext())
			System.out.println(l.next());
	}

}
