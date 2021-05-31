package Exception_Types;

public class NullPointerException 
{
	
	public static void main(String[] args) 
	{
		dog d = new dog();
		d.bark();
	}
}

class  dog
	{
		 void bark()
		{
			System.out.println("baw baw");
		}
	}