package dsa;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQ {

	public static void main(String[] args) {
		Queue<Integer> q=new LinkedList<>();
		// to add element
		q.offer(2);
		q.offer(3);
		q.offer(4);
		q.offer(5);
		
		System.out.println(q);
		// to delete from front
		
		q.poll();
		
		System.out.println(q);
		// to know the front to be deleted
		System.out.println(q.peek());
		

	}

}
