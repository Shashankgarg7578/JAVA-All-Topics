package ValidMobileNumber;

public class TestApplictionMobileNumber 
{
 public static void main(String[] args) 
 {
	 try {
  System.out.println(TestMobilNumber.IsValidMobileNumber("8723682992"));	
	 }
	 catch(InvalidMoblieNumberException e)
	 {
		 System.out.println(e);
	 }
	 System.out.println("done");
 }
}
