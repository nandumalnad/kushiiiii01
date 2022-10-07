package collections;

import java.util.Hashtable;

public class HashTablepgm {
public static void main(String[] args)
{
	Hashtable<Integer, String> map = new Hashtable<Integer, String>();
	map.put(10, "Hi");
	map.put(20, "Hello");
	map.put(10, "Hello");    //duplicates key is not allowed
	map.put(5, "Bye");
	map.put(3, "Hello");     // duplicate values are allowed
	System.out.println(map);
	System.out.println(map.remove(20));
	System.out.println(map.size());
	System.out.println(map.containsKey(5));
	System.out.println(map.contains("Bye"));
	System.out.println(map.replace(5, "Soooper"));
	System.out.println(map.get(10));
	System.out.println(map);
	}
}
