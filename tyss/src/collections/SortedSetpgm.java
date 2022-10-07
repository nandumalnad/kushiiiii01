package collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetpgm {
 public static void main(String[] args)
 {
   SortedSet<String> set = new TreeSet<>();
   set.add("IBM");
   set.add("ATKINS");
   set.add("Google");
   set.add("Accenture");
   set.add("Cognizant");
   set.add("CapGemini");
   System.out.println(set);
   for(String str : set)
   {
	   System.out.println(str);
   }
   System.out.println();
   System.out.println(set.first());
   System.out.println(set.last());
   System.out.println(set.headSet("Google"));
   System.out.println(set.tailSet("CapGemini"));
     
}
 }
