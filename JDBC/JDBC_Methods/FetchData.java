package JDBC_Methods;
import java.sql.*;

public class FetchData 
{
  public static void main(String[] args) 
  throws Exception
  {
	Class.forName("com.mysql.jdbc.Driver");
	
	Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/userinfo", "root", "shashank") ;
	
	Statement st = co.createStatement();

	st.executeUpdate("insert into user values('04','shaefewh21ek@gmail.com','sunh')");
	
	ResultSet rs = st.executeQuery("select * from user");
		
	while(rs.next())
	{
		System.out.println(rs.getString("name"));
		System.out.println(">>");
		System.out.println();
	}
	System.out.println("Query executed");	
  }
}
