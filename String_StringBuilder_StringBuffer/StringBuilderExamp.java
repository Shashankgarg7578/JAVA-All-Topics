package String_StringBuilder_StringBuffer;

public class StringBuilderExamp {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder("Hello ");  
		sb.insert(1,"Java");//now original string is changed  
		System.out.println(sb);//prints HJavaello  
	}

}
