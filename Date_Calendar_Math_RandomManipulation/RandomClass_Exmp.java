package Date_Calendar_Math_RandomManipulation;

import java.util.Random;
import java.util.Scanner;

public class RandomClass_Exmp {

	public static void main(String[] args) 
    {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number from 5 to 10: ");
		int num = sc.nextInt();
		if(num >= 5 && num <= 10)
		{
			System.out.print("OTP of "+num+" digits is ");
			
			for(int i = 1; i <= num; i++)
			{
				System.out.print(r.nextInt(10));
			}
		}
		else
		{
			System.out.println("invalid number");
		}
	}

}
