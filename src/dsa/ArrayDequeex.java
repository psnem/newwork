package dsa;

import java.util.ArrayDeque;

public class ArrayDequeex {

	public static void main(String[] args) {
		ArrayDeque<Integer> adq=new ArrayDeque<Integer>();
		//it is called array deck
		
		adq.offer(11);
		adq.offer(12);
		adq.offer(16);
		adq.offer(15);
		adq.offer(13);
		adq.offer(10);
		
		System.out.println(adq); //no order, it was printed as it is added
		adq.offerFirst(1);
		
		adq.offerLast(100);
		System.out.println(adq);
		
		System.out.println(adq.peek());

		System.out.println(adq.peekFirst());

		System.out.println(adq.peekLast());
		
		System.out.println(adq);
		adq.poll();
		System.out.println(adq);
		adq.pollFirst();
		adq.pollLast();
		System.out.println(adq);

	}

}
