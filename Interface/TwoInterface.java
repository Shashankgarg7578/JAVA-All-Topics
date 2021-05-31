interface  TCS
{
	abstract void DesktopApp();	
}	

interface Wipro
{
 abstract void 	WebApp();
}

class Employee implements TCS 
{
  public void WebApp()
  {
	  System.out.println("shashank");
  }

@Override
  public void DesktopApp() 
  {
	// TODO Auto-generated method stub
	System.out.println("Garg");
   }
}
public class TwoInterface 
{
 public static void main(String[] args) 
 {
   TCS t1 = new Employee();
   Employee t2 = new Employee();
   t1.DesktopApp();
   t2.WebApp();
   System.out.println(t1);
   System.out.println(t2);
 }
}
