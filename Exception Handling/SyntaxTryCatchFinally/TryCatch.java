package SyntaxTryCatchFinally;

public class TryCatch
{
 public static void main(String[] args) 
 {
  try
  {
	int choice = 4;
	if(choice ==1)
	{
	 int i = 0/0;	
	}
	else if(choice == 2)
	{
		int[] a = new int[-1];
	}
	else if(choice == 3)
	{
		int j = Integer.parseInt("1 2 3");
	}
	else if(choice == 4)
	{
		System.out.println("1 2 3".split("")[5]);
	}
  }
  catch(Exception e)
  {
	  //this method used for print "ExceptionName , Description and Line of exception occur"
	  e.printStackTrace();
	  
	  //method used for only print "ExceptionName and Description"
	  System.out.println("inside catch"+e);
	  
	  //it only print description
	  System.out.println(e.getMessage());
  }
 }	
}