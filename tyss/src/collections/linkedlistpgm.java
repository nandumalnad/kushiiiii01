package collections;

import java.util.LinkedList;

public class linkedlistpgm {
public static void main(String[] args) {
	LinkedList<Object> list = new LinkedList<Object>();
	list.add(10);
	list.add("Bhushan");
	list.add("H");
	list.add(null);
	list.add(30);
	list.addFirst("Hi");
	list.addLast("10");
	System.out.println(list);
	System.out.println(list.getFirst());   //get first value
	System.out.println(list.getLast());     // get last value
	System.out.println(list.get(1));     // get index 1 value
	System.out.println(list.removeFirst());  // removes first value
	System.out.println(list.remove(2));     //remove index 2
	System.out.println(list.removeLast());   // remove last value
	LinkedList<Object> list2 = new LinkedList<Object>();
	list2.add(30);
	list2.add("hi");
	list2.add(10);
	list2.add(0);
	list2.add(10);
	list2.retainAll(list2);   //show the duplicates present in list2 with respect to list1
	System.out.println(list);
	list.removeAll(list2);    // remove the duplicates present in list2 with respect to list1
	System.out.println(list);
	list.addAll(list2);     // add all values to the list
	for(Object obj : list)    // fetch values present in list one by one
	{
		System.out.println(obj);
	}
}
	}
