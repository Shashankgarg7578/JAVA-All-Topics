package Set_Examples;

import java.util.HashSet;
import java.util.Set;

public class Set_HashSet_01 
{
  public static void main(String[] args) 
  {
	  //Example 1.
	
	  /*1. it is remove the Same elements if added and it print 
	       rest of elements with "no order"(no order means randomly)
	    2. It is the most widely used in programming field
	    3. It is the Faster in Set.
	  */
	 Set<String> set = new HashSet<String>();
	 set.add("Shashank");
	 set.add("John");
	 set.add("Rupesh");
	 set.add("Bilal");
	 set.add("Rishab");
	 set.add("Shashank");
	 
	 for(String s : set)
	 {
		 System.out.println(s);
	 }
	 
	 System.out.println(set.contains("shashank"));
  System.out.println("*****************");
	//Example 2 
	 /*no ordering in this  example because we use Hash set and in Hash Set 
	  * no ordering are there*/
	  
	 Set<String> set2 = new HashSet<>();
		for(int i = 30; i>0; i--){
			set2.add("A"+i);
		}
		for(String i: set2){
			System.out.println(i);
		}
	 
	 
  }
}
