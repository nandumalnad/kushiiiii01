package collections;

import java.util.Vector;

public class vectorpgm {
public static void main(String[] args)
{
	Vector<Object> vec = new Vector<Object>();
	vec.add(10);
	vec.add(15);
	vec.add(25);
	vec.add("Nandini");
	vec.add("N");
	vec.add(null);
	vec.add("Khushi");
	vec.add("R");
	System.out.println(vec);		
	System.out.println(vec.firstElement());
	System.out.println(vec.lastElement());
	System.out.println(vec.indexOf("Khushi"));
	vec.add(5,"Ravi");
	System.out.println(vec);
}
}
