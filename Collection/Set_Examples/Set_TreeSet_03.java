package Set_Examples;

import java.util.Set;
import java.util.TreeSet;

public class Set_TreeSet_03 
{
   public static void main(String[] args) 
   {
	   /* 1. It is maintain ordering and sorting of elements ,
	         so it prints in sort ordering.
	      2. It is slower than HastSet and LinkedHashSet.
	    * */
	   
	   Set<String> set = new TreeSet<>();
		for(int i = 30; i>0; i--){
			set.add("A"+i);
		}
		for(String i: set){
			System.out.println(i);
		}
   }
}
