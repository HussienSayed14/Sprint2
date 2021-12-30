import java.sql.SQLException;

public class Data_Insertions extends MyDataBase {
	
	public void InsertIntoRideReq(String cUser,String so,String de) throws SQLException
	{
		createConnection();
		String dbo ="INSERT INTO ridereq VALUES('" +cUser + "' , '" + so + "' , '" + de + "')";
		stmt.execute(dbo);
		
	}
	
	public void InsertIntoFavArea(String CurrentUser, String FavArea) throws SQLException
	{
		createConnection();
		String dbo ="INSERT INTO driverfavareas VALUES('" +CurrentUser + "' , '" + FavArea + "')";
		stmt.execute(dbo);

		
	}
	
	public void InsertIntoUserInfo(String user_name,String password,int phone) throws SQLException
	{
          createConnection();
		
		String dbo ="INSERT INTO userinfo VALUES('" + user_name + "' , '" + password + "' , " + phone + ")";
		stmt.execute(dbo);
		
	}
	public void InsertIntoDriverInfo(String user_name,String password,int phone,String License,int ID) throws SQLException
	{
          createConnection();
		
		String dbo ="INSERT INTO driverinfo VALUES('" + user_name + "' , '" + password + "' , " + phone + ", '" + License + "' , " + ID + 0 + " )";
		stmt.execute(dbo);
		
	}
	
	public void InsertIntoDriver_RidesOffer(String Usern ,String Cuser,String Source,String Dest ,int offer) throws SQLException
	{
		createConnection();
		String dbo ="insert into rides_offer values ( '"+Usern +"','" + Cuser + " ' , '" + Source + "' , '" + Dest + "'," + offer +")";
		stmt.execute(dbo);
	}

	}
