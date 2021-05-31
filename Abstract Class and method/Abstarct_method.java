abstract class AA
{
	public abstract void method();
}

 class CC extends AA
 {
	public void method()
	 {
		 System.out.println("shashank");
	 }
	 
 }
 
public class Abstarct_method 
{
      public static void main(String[] args) {
    	  AA a = new CC();
    	  a.method();
    	  
	}
     
}
