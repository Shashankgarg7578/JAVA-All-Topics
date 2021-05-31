package OOPS_Concepts;

class Person{
	private String name;
    private String city;
    private int salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}



class Encapsulation{
	public static void main(String[] args) 
	{
		Person P = new Person();
		P.setName("Shashank Garg");
		P.setCity("Amroha");
		P.setSalary(420000);
  
         System.out.println(P.getName());
         System.out.println(P.getCity());
         System.out.println(P.getSalary());
	}
	
}