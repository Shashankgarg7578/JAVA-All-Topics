package OrangeMantra;

class Bike
{
	void Bikes()
	{
		System.out.println("Bikes are there");
	}
}

class SuperSplender extends Bike
{
	void BlackSuperSplender()
	{
		System.out.println("SuperSplender are there");
	}
	
	void Bikes()
	{
		System.out.println("Bikes are in SuperSplender");
	}
}

class Duke extends Bike
{
	void OrangeDuke()
	{
		System.out.println("Duke are there");
	}
}

public class RuntimePolymorphism 
{
	public static void main(String[] args)
	{
		Bike S1 = new SuperSplender();
		Bike D1 = new Duke();
	  
		S1.Bikes();
		
	}
      
}
