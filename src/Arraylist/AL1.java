package Arraylist;

import java.util.ArrayList;

public class AL1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//		Create an ArrayList of integers, add the elements [12, 25, 34, 46] to it
	//		Remove the number 25 from the ArrayList
	//		Print the final ArrayList
          ArrayList<Integer> al=new ArrayList<Integer>();
          al.add(12);
          al.add(25);
          al.add(34);
          al.add(46);
          for(int i=0;i<al.size();i++)
          {
        	  if(al.get(i)==25)
        		  al.remove(i);
          }
          System.out.println(al);
	}

}
