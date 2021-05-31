package Date_Calendar_Math_RandomManipulation;

import java.util.Date;

public class DateClass_Examp 
{
   public static void main(String[] args) 
   {
    //Date method is used for date and there are diffrent methods in date class.
	   Date date = new Date();
	   System.out.println(date);
	  
	   //comparision of dates
	   /*
	    Return
         1. It returns the value 0 if the argument Date is equal to this Date. 
         2. It returns a value less than 0 if this Date is before the Date argument.
         3. It returns a value greater than 0 if this Date is after the Date argument.
	     */
	   Date d=new Date(2021,05,31);
	   System.out.println(d.equals(date));
       Date d1=new Date(2021,5,26);  
       int comparison=d.compareTo(d1); 
       System.out.println();
       System.out.println("Your comparison value is : "+comparison);  
   }	
}
