package String_StringBuilder_StringBuffer;

//Strings are immutable in java
class StringsExamples
{
   public static void main(String[] args)  
   {
	   String s1="java";//creating string by java string literal  
	   char ch[]={'s','t','r','i','n','g','s'};  
	   String s2=new String(ch);//converting char array to string  
	   String s3=new String("example");//creating java string by new keyword  
	   System.out.println(s1);  
	   System.out.println(s2);  
	   System.out.println(s3);  

	   //In Strings different types of methods are available in java example: concat , replace e.t.c
	   String s4 = s1.concat(s2);
	   System.out.println(s4);
   }	
	
}