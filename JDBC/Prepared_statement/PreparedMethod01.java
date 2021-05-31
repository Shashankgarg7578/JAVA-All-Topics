package Prepared_statement;
import java.sql.*;

class PreparedMethod01
{
	public static void main(String[] args) 
	throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/shashank","root","shashank");
	  PreparedStatement pst = co.prepareStatement("Insert into employe values(?,?,?)");
	  
	  pst.setInt(1, 26);
	  pst.setString(2, "heyt23f23fello");
	  pst.setString(3, "heyatdgfre");
	  pst.execute();
	  //System.out.println("row effected are "+pst.executeUpdate());
	  
	  
	
	}
}