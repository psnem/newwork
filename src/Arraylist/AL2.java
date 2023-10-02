package Arraylist;

import java.util.ArrayList;

public class AL2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Create a LinkedList of integers with the following nodes: 5, 10, 15, 20.
//		Find the middle node of the list and output it to the console
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(5);
		al.add(10);
		al.add(15);
		al.add(20);
		int mid=al.get(al.size()/2);
		System.out.println(mid);
	}

}
