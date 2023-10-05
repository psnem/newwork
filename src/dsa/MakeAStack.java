package dsa;

import java.util.Stack;

public class MakeAStack {

	public static void main(String[] args) {
		
		Stack<String> st=new Stack<>();
		st.push("Durgesh");
		st.push("Chandu");
		st.push("Shubham");
		st.push("Kartik");
		st.push("Neel");
		
		System.out.println(st);
		//know the top of the stack
		System.out.println("Top of the stack is "+st.peek());
		//Pop the element
		st.pop();
		System.out.println("Top of the stack is "+st.peek());
	}

}
