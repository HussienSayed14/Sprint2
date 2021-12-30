import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
public class MyDataBase {

	java.sql.Connection con;
	Statement stmt ;
	ResultSet rs;
	PreparedStatement Stmt;
	
	ArrayList<String> names = new ArrayList();
	
	void createConnection()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db" , "root", "root");
			
			
			stmt = con.createStatement();
			//Stmt = (PreparedStatement) con.createStatement();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SQLException e)
		{
			
		}
	
	}
	
}
