package ArrayList_Emp;

import java.util.Stack;

public class Stack_Examp_03 {

	public static void main(String[] args) 
	{
	  Stack<Integer> stac = new Stack<>();
	  stac.push(10);
	  stac.push(20);
	  stac.push(30);
	  stac.push(40);
	  stac.push(50);
	  
	  Stack_Examp_03 s = new Stack_Examp_03();
	  
	  //display elemnts
	  s.Display(stac);
	  System.out.println("******");
	  
	//Search elements
	  System.out.println(stac.search(30));
	  
	  System.out.println("******");
	  //delete element from top
	  stac.pop();
	  stac.pop();
	  s.Display(stac);
	  
	}
	void Display(Stack<Integer> list)
	{
		for(Integer i : list)
		  {
			  System.out.println(i);
		  }
	}
}
