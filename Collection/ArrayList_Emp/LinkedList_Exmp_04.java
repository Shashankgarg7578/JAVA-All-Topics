package ArrayList_Emp;

import java.util.LinkedList;

public class LinkedList_Exmp_04 
{
 public static void main(String[] args) 
 {
   LinkedList<String> countries = new LinkedList<String>();
   countries.add("India");
   countries.add("USA");
   countries.add("Poland");
   countries.add("Russia");
   countries.add("Erypt");
   
   new LinkedList_Exmp_04().DisplayList(countries);
   
   //Add elements in a specific position in LinkedList
   System.out.println("*********");
   countries.add(1, "Canada");
   new LinkedList_Exmp_04().DisplayList(countries);
   
   //set name or change
   System.out.println("*********");
   countries.set(0, "INDIA");
   new LinkedList_Exmp_04().DisplayList(countries);
   
   //remove on specific position
   System.out.println("*********");
   countries.remove(4);
   new LinkedList_Exmp_04().DisplayList(countries);
 }
 
 void DisplayList(LinkedList<String> list)
 {
	 for(String i : list)
	 {
		 System.out.println("Elements are: "+i);
	 }
 }
}
