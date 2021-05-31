
abstract class text
{
	static  int a = 10;
  static void method01()
  { 
	  System.out.println("this is a static method method ");
  }
}
public class  Static_Method
{
	  public static void main(String[] args) 
	  {
		 text.method01();
		 System.out.println(text.a);
	  }

}
