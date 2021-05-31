package DesignClass_Arrays_ArrayOfObjects_Enum;

public class EnumInJava 
{
   public enum Seasons{WINTER,SPRING,SUMMER,FALL};
   
   public static void main(String[] args) 
   {
	   //for each loop is only used for fetching
	 for(Seasons s : Seasons.values())
	 {
		 System.out.println(s);
	 }

   }
}



/*
 It can be used for days of the week (SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, and SATURDAY) ,
  directions (NORTH, SOUTH, EAST, and WEST), season (SPRING, SUMMER, WINTER, and AUTUMN or FALL), 
  colors (RED, YELLOW, BLUE, GREEN, WHITE, and BLACK) etc. According to the Java naming conventions,
   we should have all constants in capital letters. So, we have enum constants in capital letters.
 */