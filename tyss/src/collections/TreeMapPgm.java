package collections;

import java.util.TreeMap;

public class TreeMapPgm {
public static void main(String[] args)
{
	TreeMap<Integer, String> map = new TreeMap<Integer, String>();
	map.put(10, "hi");
	map.put(20, "hello");
	map.put(10, "hello");   //duplicate key is not allowed
	map.put(5, "Bye");
	map.put(3, "hello");    //duplicate values are allowed
	map.put(4, null);   //allowed
	map.put(2, null);    //allowed
	System.out.println(map);
}
}
