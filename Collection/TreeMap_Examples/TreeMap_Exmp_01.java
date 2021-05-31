package TreeMap_Examples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class TreeMap_Exmp_01 {

	public static void main(String[] args)
	{
	   Map<Integer, String> student = new HashMap<>();
	   student.put(1, "Shashank");
	   student.put(2, "Bilal");
	   student.put(3, "Rupesh");
	   student.put(4, "Rishab");
	   student.put(5, "Shashank");
	   
	   for(Map.Entry<Integer, String> s : student.entrySet())
	   {
		   //it print key and value both
		   System.out.println(s);
	
	   }
	   
	   System.out.println("************");
	   
	   //this is for individual           this for all elements
	   for(Map.Entry<Integer, String> s : student.entrySet())
	   {
		   //in this individually items works
		   System.out.println("Key: "+s.getKey()+" Value: "+s.getValue());
	   }
	   
	   System.out.println("************");
	   
	   Iterator<Entry<Integer, String>> entry = student.entrySet().iterator();
       while(entry.hasNext())
       {
    	   /*If we don't use this line then only half of the values are printed 
    	      because next method do the cursor on next element.
    	   */
    	   Entry<Integer, String> temp = entry.next();
    	   
    	   System.out.println("key: "+temp.getKey()+" Value: "+temp.getValue());
       }
	}

}
