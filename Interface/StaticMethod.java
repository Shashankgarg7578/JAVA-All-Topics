interface Nani
{
  public static final int a = 10;
  static void method01()
  {
	  System.out.println("shashank");
  }
}


public class StaticMethod 
{
 public static void main(String[] args) 
 {
    System.out.println(Nani.a);
    Nani.method01();
}
}
