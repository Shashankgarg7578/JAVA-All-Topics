package ArrayList_Emp;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIterator_Examp_05 
{
  public static void main(String[] args) 
  {
	  List<String> countries = new LinkedList();
		countries.add("India");
		countries.add("USA");
		countries.add("Poland");
		countries.add("Egypt");
		countries.add("Thailand");
		countries.add("Russia");
	
		new ListIterator_Examp_05().DisplayList(countries);
		
		System.out.println("**********");
		countries.sort(null);
		new ListIterator_Examp_05().DisplayList(countries);
		
		System.out.println("**********");
		Collections.reverse(countries);
		new ListIterator_Examp_05().DisplayList(countries);
		
  }
  
  void DisplayList(List<String> list)
  {
	  ListIterator<String> iterator = list.listIterator();
	  while(iterator.hasNext())
	  {
		  System.out.println("Element: "+iterator.next());
	  }
  }
}
