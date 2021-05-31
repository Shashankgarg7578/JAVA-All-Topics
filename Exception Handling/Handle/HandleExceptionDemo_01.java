package Handle;

import java.util.Scanner;

public class HandleExceptionDemo_01
{
  public static void main(String[] args) 
  {
	Scanner sc = new Scanner(System.in);
	System.out.println("Code before Try block");
	try
	{
		System.out.println("code inside Try block Before riskycode");
          System.out.print("Input a number :-");
          int i = sc.nextInt();
          System.out.print("Input a number Again :-");
          int j = sc.nextInt();
          int k = i/j;  //risky code
          int array[] = new int[k]; //risky code
          System.out.println("code inside Try block after riskycode");
	}
	catch(Exception e)
	{
		System.out.println("Inside Catch block"+e);
		System.out.println(e.getMessage());
	}
	finally
	{
		System.out.println("inside finally");
	}
	System.out.println("hello");
  }
}
