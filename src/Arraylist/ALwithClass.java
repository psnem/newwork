package Arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ALwithClass {
	int id;
	String name;
	int age;
	public ALwithClass(int id,String name,int age) {
		this.id=id;
		this.name=name;
		this.age=age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ALwithClass st1=new ALwithClass(1,"Piyush", 30);
		ALwithClass st2=new ALwithClass(2,"Chandu", 26);
		ALwithClass st3=new ALwithClass(3,"Durgesh", 25);
		ALwithClass st4=new ALwithClass(4,"Neel", 23);
		
		ArrayList<ALwithClass> list=new ArrayList<ALwithClass>();
		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);
		System.out.println(list);
		
		System.out.println("traversing by iterator");
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			ALwithClass al=(ALwithClass)itr.next();
			System.out.println(al);
			
		}
		
		
		

	}

}
