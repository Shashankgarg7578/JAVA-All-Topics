package Set_Examples;

import java.util.LinkedHashSet;
import java.util.Set;

public class Set_LinkedHash_02
{
  public static void main(String[] args) 
  {
	/*  LinkedHashSet print data as you provided it prints the same way,
	 *  in this the print elements and input order are same .
	 *  It is the slower comparison to HashSet.
	  */
	Set<String> set = new LinkedHashSet();
	for(int i = 30 ; i>0 ;i--)
	{
		set.add("A"+i);
	}
	
	for(String i : set)
	{
		System.out.println(i);
	}

  }
}
