package JDBC_Methods;
import java.sql.*;

public class ResultSetMetaData01
{
 
public static void main(String[] args) 
		  throws Exception 
  {
	 Class.forName("com.mysql.jdbc.Driver");
	 
	 Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/shashank", "root", "shashank");
	
	 Statement st = co.createStatement();
	 
	 ResultSet rs = st.executeQuery("Select * from employe");
	 
	 ResultSetMetaData rst = rs.getMetaData() ;
	 
	 System.out.println("no of cols in RS are "+rst.getColumnCount());
		System.out.println();
	
	 for(int i = 1; i<=rst.getColumnCount();i++)
	 {
		 System.out.println(rst.getColumnName(i));
		 System.out.println(rst.getColumnTypeName(i));
		 System.out.println();
		 
	 }
		 
  }  
}
