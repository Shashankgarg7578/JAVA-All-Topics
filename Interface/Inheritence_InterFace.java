interface employe
{
	public abstract void method01();
	public abstract void method();
}
class father 
{
	public void method01()
	{
		System.out.println("heya");
	}
}
class webapp extends father implements employe
{

	@Override
	public void method() 
	{
		System.out.println("hello");
	}
	
}

public class Inheritence_InterFace 
{
	public static void main(String[] args) {
		employe a = new webapp();
		a.method();
		a.method01();
	}

}
