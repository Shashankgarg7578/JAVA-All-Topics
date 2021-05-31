  
interface ww 
{
 public abstract void work();
  
}
 class z implements ww
 {
	public void work()
	 {
		 System.out.println("hello");
	 }
 }
 
public class  Abstract_Method01
{
   public static void main(String[] args)
   {
	ww a = new z();
	a.work();
   }  
}
