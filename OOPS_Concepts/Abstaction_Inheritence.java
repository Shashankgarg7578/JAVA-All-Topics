package OOPS_Concepts;

//abstraction
abstract class Vinove
{
	//abstract method .
	abstract void project1();
	
	//static method .
	static int a = 10;
	
	//non static method
	int y = 20;
}


//Inheritence
class employee extends Vinove
{

	@Override
	void project1() {
		// TODO Auto-generated method stub
		System.out.println("This is the implementation of Project 1");
	}
	
}




public class Abstaction_Inheritence {

	public static void main(String[] args) {
		
		employee E1 = new employee();
		
		//To call non static variable
        System.out.println(E1.y);
        
        //to call static variable
        System.out.println(Vinove.a);
        
        //to call abstract method which implement by employee. 
		E1.project1();
	}

}
