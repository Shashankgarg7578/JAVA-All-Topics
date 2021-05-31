package Exception_Types;

public class ArrayStoreException
{
  public static void main(String[] args)
  {
	Animal a = new Lion();
	Lion l = (Lion)a;
	 Cat c = (Cat)a; 

  }
}
class Animal
{
  void animal()
  {
	  System.out.println("this is a animal");
  }
}

class Lion extends Animal
{
	void lion()
	{
		System.out.println("this is lion");
	}
}

class Cat extends Animal
{
	void cat()
	{
		System.out.println("this is a cat");
		
	}
}