package DesignClass_Arrays_ArrayOfObjects_Enum;

class employee
{
   int emp_id;
   String emp_name;
   int emp_salary;
   
   employee(int id ,String name , int salary)
   {
	   emp_id=id;
	   emp_name= name;
	   emp_salary = salary;
   }
   
   void display()
   {
	   System.out.println("Employee id :"+ emp_id +" ,Employee name :"+ emp_name +" ,Employee salary :"+emp_salary);
   }
}


public class ArraysOfObject 
{
   public static void main(String[] args) 
   {
	   //create a array which contains 5 objects
	  employee[] E = new employee[5];
	  
	  E[0] = new employee(1, "Ram", 30000);
	  E[1] = new employee(2, "Shyam", 40000);
	  E[2] = new employee(3, "Bheem", 33000);
	  E[3] = new employee(4, "Ben", 35000);
	  E[4] = new employee(5, "Aashu",50000);
   
     E[0].display();
     E[1].display();
     E[2].display();
     E[3].display();
     E[4].display();
	  
   }
}
