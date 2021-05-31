interface AA
{
	
   int a = 12;
   default void method()
   {
	   System.out.println("shashank");
   }
}

class BB implements AA
{
  	void method02()
  	{
  		System.out.println("Garg");
  	}
}

public class Non_Static 
{
 public static void main(String[] args) 
 {
    AA a = new BB();
   
     a.method();
     
    BB b = new BB();
     b.method02();
     
     System.out.println(AA.a);
 }
}
