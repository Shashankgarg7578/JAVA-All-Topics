package JDBC_Methods;
import java.sql.*;
public class JDBCDemo01 
{
	public static void main(String[] args) 
	throws Exception
	{
		//load driver class
		Class.forName("com.mysql.jdbc.Driver");
		
		//get object of conection
		Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/shashank", "root", "shashank");
		
		//get object of statement
		Statement st = co.createStatement();
		
	 
		
		st.executeUpdate("INSERT INTO EMPLOYE VALUE(78,'TDC',55)");
		st.executeUpdate("INSERT INTO EMPLOYE VALUE(79,'yjgvh',5587)");
		st.executeUpdate("INSERT INTO EMPLOYE VALUE(80,'TDCyu',55)");

		
		//close connection
		co.close();
		System.out.println("query executed");
	}

}
