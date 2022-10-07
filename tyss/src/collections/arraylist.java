package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class arraylist 
{
	public static void main(String[] args)
	{
ArrayList<Object> list = new ArrayList<Object>();    //created object for arraylist and can add any type of data
		list.add(20);
		list.add(30);
		list.add(20);
		list.add("Java");
		list.add(null);
		list.add(null);
		System.out.println(list);
		list.add(2,"hello");  // In index 2 adding the value hello
		System.out.println(list);
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(50);
		list2.add(8);
		list2.add(1);
		list2.add(30);
		Collections.sort(list2);   //used to sort the elements
		System.out.println(list2);
		list.addAll(list2);        // used to add list2 to list
		System.out.println(list);
		if(list.contains("hi"))    // used to check whether elements is present or not
		{
			System.out.println("is present");
		}
		else
		{
			System.out.println("not present");
		}
					System.out.println(list.remove(1));
			for(Object obj : list)
			{
				System.out.println(obj);
			}
	}
}
			
			
