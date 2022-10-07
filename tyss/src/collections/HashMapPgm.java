package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map.Entry;

public class HashMapPgm {
public static void main(String[] args)
{
	HashMap<Integer, String> map = new HashMap<Integer, String>();
	map.put(20, "hello");
	map.put(10, "hello");   //duplicate key is not allowed
	map.put(5, "Bye");
	map.put(3, "hello");  // duplicate values are allowed
	map.put(null, "xyz");   //one null key is allowed
	map.put(null, "xyza");    
	map.put(4, null);     //null values are allowed
	map.put(6, null);     // null values are allowed
	System.out.println(map);
	System.out.println(map.remove(20));
	System.out.println(map.size());
	System.out.println(map.containsKey(5));
	System.out.println(map.replace(5, "Super"));
	System.out.println(map.get(10));
	System.out.println(map);
	for(Entry<Integer, String>m: map.entrySet())
	{
		System.out.println(m.getKey()+" " +m.getValue());
	}
	
	
	
}
}
