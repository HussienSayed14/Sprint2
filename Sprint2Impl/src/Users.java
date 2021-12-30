import java.sql.SQLException;
import java.util.ArrayList;

public abstract class Users  {
	
	
	MyDataBase db= new MyDataBase();
	Data_Insertions insert = new Data_Insertions();
	Data_Retrieving ret = new Data_Retrieving();
	public abstract  void  Login(String user_name,String Pass) throws SQLException;
	public abstract void Update(int price);
	public abstract void Register(String user_name, String password, int phone) throws SQLException;
	public abstract String getUser();
	public abstract String getPass();
	public abstract boolean getStat();
	public abstract int getID();
	
		}
