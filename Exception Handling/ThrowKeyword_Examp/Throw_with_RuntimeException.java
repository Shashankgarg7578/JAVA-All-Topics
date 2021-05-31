package ThrowKeyword_Examp;

import java.util.Scanner;

/* 1. this extends RuntimeException it means we create a Exception Handler
      for run time exception but program abnormal.
   2. This is used for coustom exception.
  */
class YoungerAgeException extends RuntimeException
{
	YoungerAgeException(String msg)
	{
		super(msg);
	}
	
}


public class Throw_with_RuntimeException 
{
   public static void main(String[] args) 
   {
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter your age");

	  int age = sc.nextInt();
	  
	  if(age<18)
	  {
		  /*1. It creates the handler use default JVM Exception
		    2. Throw used inside the method and Throws used with method
		  */ 
		  throw new YoungerAgeException("You are not eligible for voting");
	  }
	  else 
	  {
		  System.out.println("You are eligible");
	  }
   }
}
