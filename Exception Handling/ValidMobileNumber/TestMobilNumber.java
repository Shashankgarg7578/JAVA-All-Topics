package ValidMobileNumber;

public class TestMobilNumber
{
  public static boolean IsValidMobileNumber(String mobile_number)
  {
	 
	  if(mobile_number.length()==10  && mobile_number.charAt(0) == '8')
	  {
		  return true;
	  }
	  else
	  {
		  String message = "not started with 9";
		  
		  if(mobile_number.length()!=10)
		  {
			  message = "expected length=10 actual="+mobile_number.length();
		  }
		  //create obj of custom exception
		  InvalidMoblieNumberException obj = new InvalidMoblieNumberException(message);
		  throw obj;
	  }
  }
}
