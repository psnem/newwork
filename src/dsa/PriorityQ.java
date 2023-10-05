package dsa;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQ {

	public static void main(String[] args) {
		Queue<Integer> pq= new PriorityQueue<Integer>();// min no has maximum queue
			pq.offer(12);
			pq.offer(15);
			pq.offer(25);
			pq.offer(6);
			pq.offer(66);
			
			System.out.println(pq); //min will show first
			
			System.out.println(pq.peek()); // will show the first head
			
			Queue<Integer> pq2= new PriorityQueue<Integer>(Comparator.reverseOrder());// min no has maximum queue
			pq2.offer(122);
			pq2.offer(155);
			pq2.offer(252);
			pq2.offer(61);
			pq2.offer(660);
			
			System.out.println(pq2); //max will show first
			
			System.out.println(pq2.peek()); // will show the first head
			
			
			
			
		

		//Queue<Integer> pq2= new PriorityQueue<Integer>();

	}

}
