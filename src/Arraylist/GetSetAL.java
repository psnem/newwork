package Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class GetSetAL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al=new ArrayList<String>();
		al.add("IBM");
		al.add("Tata");
		al.add("Google");
		al.add("Amazon");
		al.add("Meta");
		
		al.get(1);
		
		al.set(2,"Apple");
		
		Collections.sort(al);
		for(String s:al)
			System.out.println(s);
	}

}
