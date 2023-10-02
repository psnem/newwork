package Arraylist;

import java.util.ArrayList;

import java.util.Collections;

public class AL3 {
	public static void main(String[] args) {
		ArrayList<Integer> al3=new ArrayList<Integer>();
		al3.add(10);
		al3.add(20);
		al3.add(30);

		al3.add(15);
		al3.add(25);
		
		Collections.sort(al3);
		//sorted
		for(int val:al3)
			System.out.println(val);
		//printed
	}

}
