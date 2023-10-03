package Arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ALwithClass {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student st1=new Student(1,"Piyush", 30);
		Student st2=new Student(2,"Chandu", 26);
		Student st3=new Student(3,"Durgesh", 25);
		Student st4=new Student(4,"Neel", 23);
		
		ArrayList<Student> list=new ArrayList<Student>();
		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);
		
		//System.out.println(list);
		
		System.out.println("traversing by iterator");
		
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			Student al=(Student)itr.next();
			System.out.println(al.name+" "+al.id+" "+al.age);
			
		}
		
		
		

	}

}
