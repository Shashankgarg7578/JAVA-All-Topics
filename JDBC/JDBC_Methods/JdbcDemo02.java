package JDBC_Methods;
import java.sql.*;

public class JdbcDemo02 
{
  public static void main(String[] args) 
  throws Exception
  {
	Class.forName("com.mysql.jdbc.Driver");
	Connection co = DriverManager.getConnection("jdbc:mysql//localhost:3306/Employe", "root","shashank");
    Statement st  = co.createStatement();
    st.executeUpdate("INSERT INTO EMPLOYE VALUES('01','SARI','OMG')");
    
   
    co.close();
    System.out.println("Query Executed");
  }  
}
