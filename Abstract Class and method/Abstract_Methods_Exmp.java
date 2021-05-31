
abstract class Tcs
{
	private int id;
	private String employee_name;
	private String city;
	protected int getId() {
		return id;
	}
	protected void setId(int id) {
		this.id = id;
	}
	protected String getEmployee_name() {
		return employee_name;
	}
	protected void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	protected String getCity() {
		return city;
	}
	protected void setCity(String city) {
		this.city = city;
	}
	
}

class employee extends Tcs
{
   void Display()
   {
	   System.out.println("This is employee method");
   }
}

public class Abstract_Methods_Exmp 
{
  public static void main(String[] args) 
  {
	  Tcs e1 = new employee();
      e1.setId(1);
      e1.setCity("Amroha");
      e1.setEmployee_name("Shashank");
      
      System.out.println(e1.getId());
      System.out.println(e1.getEmployee_name());
      System.out.println(e1.getCity());
  
  }
}
