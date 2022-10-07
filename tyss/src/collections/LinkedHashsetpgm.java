package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashsetpgm {
public static void main(String[] args)
{
	LinkedHashSet<Object> set = new LinkedHashSet<Object>();
	set.add(10);
	set.add(30);
	set.add("khushi");
	set.add("hello");
	set.add(10);
	set.add(20);
	set.contains("Hi");
	set.add(null);
	set.add(null);
	System.out.println(set);
	System.out.println(set.isEmpty());
	System.out.println(set.remove(20));
	System.out.println(set.size());
	if(set.contains("Hi"))
	{
		System.out.println("present");
	}
	else 
	{
		System.out.println("Not present");
	}
	  for(Object obj : set)     // using for-each loop for fetching data
	  {
		  System.out.println(obj);
	  }
	  System.out.println();
  Iterator<Object> i = set.iterator();   //using iterator for fetching data
  while(i.hasNext())
  {
	  System.out.println(i.next());
  }
}
}
