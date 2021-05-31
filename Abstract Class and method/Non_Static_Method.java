  
abstract class BB 
{
	int b=1;
	 
  void work()
  {
	System.out.println("helo"); 
  }
}
 class animal extends BB
 {
	 
 }
 

public class Non_Static_Method 
{
   public static void main(String[] args)
   {
	animal w = new animal();
    System.out.println(w.b);
    w.work();
   }  
}
