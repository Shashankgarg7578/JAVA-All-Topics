package ArrayList_Emp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList_Exmp01 
{
   static ArrayList<String> countries = new ArrayList();
  public static void main(String[] args) 
  {
	countries.add("India");
	countries.add("USA");
	countries.add("UP");
	countries.add("Amroha");
	countries.add("Delhi");
	countries.add("Shri lanka");
	
	//print list 
	System.out.println(countries);
	
	System.out.println();
	
	ArrayList_Exmp01 C = new ArrayList_Exmp01();
	C.DisplayList(countries);
	
    System.out.println("*********");
    C.removeNameByPosition(1);
    C.DisplayList(countries);
    
    System.out.println("*********");
    C.removeNameByString("India");
    C.DisplayList(countries);
    
    System.out.println("*********");
    C.modifyName(0, "Uttar Pradesh");
    C.DisplayList(countries);
    
  }
  
  //print List elememnts one by one
  void DisplayList(ArrayList<String> country)
  {
	  //for index in foreach loop
	  int i = 0;
	  for(String s : country)
	  {
		  System.out.println(s +" "+ i++);
	  }
   }
 
  void removeNameByPosition(int position){
	   countries.remove(position);
	}
	void removeNameByString(String name){
		countries.remove(name);
	}
	void modifyName(int position, String newName){
		countries.set(position, newName);
	}
	
	int search(String name){
		return countries.indexOf(name);
	}
}
