package ArrayList_Emp;

import java.util.ArrayList;

public class AutoboxingAndUnboxing_02 {

	public static void main(String[] args) {

	    //Automatically done by compiler
		ArrayList<Integer> studentNumbers = new ArrayList<>();
		studentNumbers.add(25); //Autoboxing
		System.out.println(studentNumbers.get(0)); // unboxing 
		
		
		//how compiler do these Autoboxing an dunboxing
		ArrayList<Double> demoList = new ArrayList<>();
		demoList.add(25.5);
		//demoList.add(new Double(25.2));
		demoList.add(Double.valueOf(10.0)); //This is done while autoboxing
		//System.out.println(demoList.get(0));
		System.out.println(demoList.get(0).doubleValue()); //This is done while unboxing
		
	}

}
